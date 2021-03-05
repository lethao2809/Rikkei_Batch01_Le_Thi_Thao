import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Sach extends SanPham {
    private String nhaXB;
    private int namSX;
    private String tacgia;
    private Date ngaySX;
    private int lantaiban;

    @Override
    public String toString() {
        return "Sach{" +
                "nhaXB='" + nhaXB + '\'' +
                ", namSX=" + namSX +
                ", tacgia='" + tacgia + '\'' +
                ", ngaySX=" + ngaySX +
                ", lantaiban=" + lantaiban +
                '}';
    }


    public Sach(String maSp, String tenSp, int soluong, double dongia, String thuocDM, String nhaXB, int namSX, String tacgia, Date ngaySX, int lantaiban) {
        super(maSp, tenSp, soluong, dongia, thuocDM);
        this.nhaXB = nhaXB;
        this.namSX = namSX;
        this.tacgia = tacgia;
        this.ngaySX = ngaySX;
        this.lantaiban = lantaiban;
    }

    public Sach(String maSp, String tenSp, int soluong, double dongia, String thuocDM) {
        super(maSp, tenSp, soluong, dongia, thuocDM);
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public Date getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public int getLantaiban() {
        return lantaiban;
    }

    public void setLantaiban(int lantaiban) {
        this.lantaiban = lantaiban;
    }

    public Sach() {
        super();
    }


    @Override
    public void hienthithongtin() {
        System.out.println("Mã sản phẩm:" + getMaSp());
        System.out.println("Tên sản phẩm :" +getTenSp());
        System.out.println("Số lượng:" +getSoluong());
        System.out.println("Đơn giá: " +getDongia());
        System.out.println("Nằm trong danh mục:"+getThuocDM());
        System.out.println("Nhà xuất bản:" +getNhaXB());
        System.out.println("Năm xuất bản: " +getNamSX());
        System.out.println("Tác giả: " +getTacgia());
        System.out.println("Ngay san xuat " +getNgaySX());
        System.out.println("Lan tai ban " +getLantaiban());
    }
    @Override
    public double phantramgiamgia(String loaikh ) {
        switch (loaikh){
            case  "thuong":
                return 0.02;
            case  "VIP1":
                return 0.05;
            case "VIP2":
                return 0.1;

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
        System.out.println("Nhà xuất bản:");
        String nhaxb = scanner.nextLine();
        System.out.println("Năm xuất bản:");
        int namsx = Integer.parseInt(scanner.nextLine());
        System.out.println("Tác giả:");
        String tacgia = scanner.nextLine();
        System.out.println("Ngày sản xuất:");
        String ngaysx = scanner.nextLine();
        System.out.println("Lan tai ban:");
        int lantaiban = Integer.parseInt(scanner.nextLine());
        Date ngayXuatBanDate = new Date();
//        try {
//            ngayXuatBanDate = SimpleDateFormat("dd/MM/yyyy").parse(ngaysx);
//        } catch (Exception e){
//
//        }
    }

}
