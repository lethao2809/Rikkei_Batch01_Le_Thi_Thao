package Entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

@Entity
@Component
@Table(name = "nhanvien")
public class NhanVien implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MaNhanVien",nullable = false)
    private long MaNV;
    @Column(name = "TenNhanVien",nullable = false)
    private String TenNV;
    @Column(name = "NgaySinh",nullable = false)
    private Date NgaySinh;
    @Column(name = "ViTri",nullable = false)
    private String ViTri;
    @Column(name = "SoDienThoai",nullable = false)
    private int Sdt;
    @Column(name = "Email",nullable = false)
    private String Email;
    @Column(name = "DiaChi",nullable = false)
    private String DiaChi;

    public NhanVien(long maNV, String tenNV, Date ngaySinh, String viTri, int sdt, String email, String diaChi) {
        MaNV = maNV;
        TenNV = tenNV;
        NgaySinh = ngaySinh;
        ViTri = viTri;
        Sdt = sdt;
        Email = email;
        DiaChi = diaChi;
    }

    public NhanVien() {
    }

    public long getMaNV() {
        return MaNV;
    }

    public void setMaNV(long maNV) {
        MaNV = maNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getViTri() {
        return ViTri;
    }

    public void setViTri(String viTri) {
        ViTri = viTri;
    }

    public int getSdt() {
        return Sdt;
    }

    public void setSdt(int sdt) {
        Sdt = sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }
}
