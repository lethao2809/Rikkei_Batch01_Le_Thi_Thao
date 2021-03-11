package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import Entity.NhanVien;

import java.util.List;

@Controller
public class NhanVienController{
    @Autowired
   NhanVienService nhanVienService;

    @GetMapping("/trangchu")
    public String TrangChu(){
        return "TrangChu";
    }
    @GetMapping("/home")
    public String viewHomePage( Model model) {
        List<NhanVien> list = nhanVienService.listAll();
        model.addAttribute("lists", list);
        return "List";
    }
    @GetMapping("/new")
    public String showNewCusTomer(Model model) {
        NhanVien nhanvien = new NhanVien();
        model.addAttribute("nhanvien", nhanvien);
        return "NhanVien";
    }

}
