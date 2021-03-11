package Service;

import Entity.NhanVien;

import java.util.List;

public interface NhanVienService {
    Iterable<NhanVien> findAll();

    List<NhanVien> search(String q);

    NhanVien findOne(long manv);

    void save(NhanVien nv);

    void delete(NhanVien nv);
}
