import java.util.Date;

public class KhachHang {
    private String makh;
    private String sodt;
    private String email;
    private Date ngaysinh;
    private String loaikh;

    public KhachHang(String makh, String sodt, String email, Date ngaysinh, String loaikh) {
        this.makh = makh;
        this.sodt = sodt;
        this.email = email;
        this.ngaysinh = ngaysinh;
        this.loaikh = loaikh;
    }

    public KhachHang() {
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getLoaikh() {
        return loaikh;
    }

    public void setLoaikh(String loaikh) {
        this.loaikh = loaikh;
    }
}
