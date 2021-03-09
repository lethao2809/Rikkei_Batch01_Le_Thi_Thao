import java.util.Scanner;

public class DoChoi extends SanPham {
    private String xuatxu;
    private String thuonghieu;
    private String nhacungcap;
    private String hdsd;

    public DoChoi(String maSp, String tenSp, int soluong, double dongia, String thuocDM, String xuatxu, String thuonghieu, String nhacungcap, String hdsd) {
        super(maSp, tenSp, soluong, dongia, thuocDM);
        this.xuatxu = xuatxu;
        this.thuonghieu = thuonghieu;
        this.nhacungcap = nhacungcap;
        this.hdsd = hdsd;
    }

    @Override
    public String toString() {
        return "DoChoi{" +
                "xuatxu='" + xuatxu + '\'' +
                ", thuonghieu='" + thuonghieu + '\'' +
                ", nhacungcap='" + nhacungcap + '\'' +
                ", hdsd='" + hdsd + '\'' +
                '}';
    }

    public DoChoi(String maSp, String tenSp, int soluong, double dongia, String thuocDM) {
        super(maSp, tenSp, soluong, dongia, thuocDM);
    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public String getThuonghieu() {
        return thuonghieu;
    }

    public void setThuonghieu(String thuonghieu) {
        this.thuonghieu = thuonghieu;
    }

    public String getNhacungcap() {
        return nhacungcap;
    }

    public void setNhacungcap(String nhacungcap) {
        this.nhacungcap = nhacungcap;
    }

    public String getHdsd() {
        return hdsd;
    }

    public void setHdsd(String hdsd) {
        this.hdsd = hdsd;
    }

    @Override
    public void hienthithongtin() {
        System.out.println("Mã sản phẩm:" + getMaSp());
        System.out.println("Tên sản phẩm :" +getMaSp());
        System.out.println("Số lượng:" +getSoluong());
        System.out.println("Đơn giá: " +getDongia());
        System.out.println("Nằm trong danh mục:"+getThuocDM());
        System.out.println("Xuất xứ:" +getXuatxu());
        System.out.println("Thương hiệu: " +getThuonghieu());
        System.out.println("Nhà cung cấp: " +getNhacungcap());
        System.out.println("Hướng dẫn sử dụng: " +getHdsd());
    }

    @Override
    public double phantramgiamgia(String loaikh) {
        switch (loaikh){
            case  "thuong":
                return 0.02;
            case  "VIP1":
                return 0.05;
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

    }
}
