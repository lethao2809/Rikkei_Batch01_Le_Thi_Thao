package Repository;

import Entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NhanVienRepository extends JpaRepository<NhanVien,Long> {
    List<NhanVien> findByNameContaining(String q);

}
