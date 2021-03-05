import java.util.Date;
import java.util.PrimitiveIterator;

public class HoaDon {
    private String mahd;
    private String makh;
    private String masp;
    private int soluong;
    private Date ngaymua;
    private double dongia;
    private double tongtien;

    public HoaDon(String mahd, String makh, String masp, int soluong, Date ngaymua, double dongia, double tongtien) {
        this.mahd = mahd;
        this.makh = makh;
        this.masp = masp;
        this.soluong = soluong;
        this.ngaymua = ngaymua;
        this.dongia = dongia;
        this.tongtien = tongtien;
    }

    public HoaDon() {
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Date getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(Date ngaymua) {
        this.ngaymua = ngaymua;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }
}
