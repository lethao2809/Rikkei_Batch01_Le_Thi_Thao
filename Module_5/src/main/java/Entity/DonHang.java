package Entity;

import java.util.Date;

public class DonHang {
    private String Madh;
    private String MaKh;
    private String Manv;
    private Date Ngaymua;
    private Double Tongtien;

    public DonHang(String madh, String maKh, String manv, Date ngaymua, Double tongtien) {
        Madh = madh;
        MaKh = maKh;
        Manv = manv;
        Ngaymua = ngaymua;
        Tongtien = tongtien;
    }

    public DonHang() {
    }

    public String getMadh() {
        return Madh;
    }

    public void setMadh(String madh) {
        Madh = madh;
    }

    public String getMaKh() {
        return MaKh;
    }

    public void setMaKh(String maKh) {
        MaKh = maKh;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String manv) {
        Manv = manv;
    }

    public Date getNgaymua() {
        return Ngaymua;
    }

    public void setNgaymua(Date ngaymua) {
        Ngaymua = ngaymua;
    }

    public Double getTongtien() {
        return Tongtien;
    }

    public void setTongtien(Double tongtien) {
        Tongtien = tongtien;
    }
}
