import java.util.Scanner;

public class DungCu extends SanPham {
    private String xuatxu;
    private String thuonghhieu;
    private String nhacc;
    private String hdsd;
    private String mausac;
    private String chatlieu;
    private String kichthuoc;

    public DungCu(String maSp, String tenSp, int soluong, double dongia, String thuocDM, String xuatxu, String thuonghhieu, String nhacc, String hdsd, String mausac, String chatlieu, String kichthuoc) {
        super(maSp, tenSp, soluong, dongia, thuocDM);
        this.xuatxu = xuatxu;
        this.thuonghhieu = thuonghhieu;
        this.nhacc = nhacc;
        this.hdsd = hdsd;
        this.mausac = mausac;
        this.chatlieu = chatlieu;
        this.kichthuoc = kichthuoc;
    }

    @Override
    public String toString() {
        return "DungCu{" +
                "xuatxu='" + xuatxu + '\'' +
                ", thuonghhieu='" + thuonghhieu + '\'' +
                ", nhacc='" + nhacc + '\'' +
                ", hdsd='" + hdsd + '\'' +
                ", mausac='" + mausac + '\'' +
                ", chatlieu='" + chatlieu + '\'' +
                ", kichthuoc='" + kichthuoc + '\'' +
                '}';
    }

    public DungCu(String maSp, String tenSp, int soluong, double dongia, String thuocDM) {
        super(maSp, tenSp, soluong, dongia, thuocDM);
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public String getThuonghhieu() {
        return thuonghhieu;
    }

    public void setThuonghhieu(String thuonghhieu) {
        this.thuonghhieu = thuonghhieu;
    }

    public String getNhacc() {
        return nhacc;
    }

    public void setNhacc(String nhacc) {
        this.nhacc = nhacc;
    }

    public String getHdsd() {
        return hdsd;
    }

    public void setHdsd(String hdsd) {
        this.hdsd = hdsd;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getChatlieu() {
        return chatlieu;
    }

    public void setChatlieu(String chatlieu) {
        this.chatlieu = chatlieu;
    }

    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    @Override
    public void hienthithongtin() {
        System.out.println("Mã sản phẩm:" + getMaSp());
        System.out.println("Tên sản phẩm :" +getMaSp());
        System.out.println("Số lượng:" +getSoluong());
        System.out.println("Đơn giá: " +getDongia());
        System.out.println("Nằm trong danh mục:"+getThuocDM());
        System.out.println("Xuất xứ:" +getXuatxu());
        System.out.println("Thuong hiệu:" +getThuonghhieu());
        System.out.println("Nhà cung cấp:" +getNhacc());
        System.out.println("Hướng dẫn sử dựng:" +getHdsd());
        System.out.println("Màu sắc: " +getMausac());
        System.out.println("Chất liệu:" +getChatlieu());
        System.out.println("Kích thước:" +getKichthuoc());
    }

    @Override
    public double phantramgiamgia(String loaikh) {
        switch (loaikh){
            case  "thuong":
                return 0.01;
            case  "VIP1":
                return 0.03;
            case "VIP2":
                return 0.07;

        }
        return 0;
    }
    public void Them(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sản   : ");
        String masp = scanner.nextLine();
        System.out.println("Tên sản phẩm: ");
        String tensp = scanner.nextLine();
        System.out.println("Nhap vào so lương:");
        int soluong = Integer.parseInt(scanner.nextLine());
        System.out.println("Đơn giá:");
        double dongia = Double.parseDouble(scanner.nextLine());
        System.out.println("Nằm trong danh mục:");
        String thuocdm = scanner.nextLine();
        System.out.println("Xuất xứ:");
        String xuatxu = scanner.nextLine();
        System.out.println("Thương hiệu:");
        String thuonghieu = scanner.nextLine();
        System.out.println("Nhà cung cấp:");
        String nhacc = scanner.nextLine();
        System.out.println("Hướng dẫn sử dụng:");
        String hdsd = scanner.nextLine();
        System.out.println("Màu sắc:");
        String mausac = scanner.nextLine();
        System.out.println("Chất liệu:");
        String chatlieu = scanner.nextLine();
        System.out.println("Kích thước:");
        String kichthuoc = scanner.nextLine();

    }
}
