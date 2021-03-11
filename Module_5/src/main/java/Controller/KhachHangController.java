package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class KhachHangController {
    @GetMapping
    public String KhachHang (){
        return "KhachHang";
    }

    @GetMapping("/hello")
    public String showHello(){
        return "1";
    }
}
