public abstract class SanPham {
    private String maSp;
    private String tenSp;
    private int soluong;
    private double dongia;
    private String thuocDM;
    public abstract void hienthithongtin();
    public abstract double phantramgiamgia(String loaikh);
    public abstract void luuvaofile();
    public abstract void Them();
    public SanPham(String maSp, String tenSp, int soluong, double dongia, String thuocDM) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thuocDM = thuocDM;
    }

    public SanPham() {
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public String getThuocDM() {
        return thuocDM;
    }

    public void setThuocDM(String thuocDM) {
        this.thuocDM = thuocDM;
    }
}
