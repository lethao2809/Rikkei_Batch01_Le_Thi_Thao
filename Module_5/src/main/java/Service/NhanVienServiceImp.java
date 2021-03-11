package Service;

import Entity.NhanVien;
import Repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImp implements NhanVienService{
    @Autowired
    private NhanVienRepository nvrp;

    @Override
    public Iterable<NhanVien> findAll() {
        return nvrp.findAll();
    }

    @Override
    public List<NhanVien> search(String q) {
        return nvrp.findByNameContaining(q);
    }

    @Override
    public NhanVien findOne(long manv) {
        return null;
    }


    @Override
    public void save(NhanVien nv) {
        nvrp.save(nv);
    }

    @Override
    public void delete(NhanVien nv) {
        nvrp.delete(nv);
    }
}
