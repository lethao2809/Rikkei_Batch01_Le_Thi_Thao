import java.util.Date;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class HoaDon {
    private String mahd;
    private String makh;
    private String masp;
    private int soluong;
    private Date ngaymua;
    private double dongia;
    private double tongtien;

     public HoaDon()
         Scanner sc = new Scanner(System.in);
     }

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
    public void hienThiThongTin(){
        System.out.println("---------Hien thi thong tin hoa don--------");
        System.out.println(this.toString());
    }

    public HoaDon themMoiHoaDon(){
        System.out.println("---------Them hoa don-----------");
        System.out.println("Ma hoa don: ");
        String maHoaDon = scanner.nextLine();
        System.out.println("Ma khach hang: ");
        String maKhachHang = scanner.nextLine();
        System.out.println("Ma san pham: ");
        String maSanPham = scanner.nextLine();
        System.out.println("So luong");
        int soLuong = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ngay mua: ");
        Date ngayMua = new Date();
        try {
            ngayMua = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        } catch (Exception e){

        }
        System.out.println("Don gia: ");
        float donGia = scanner.nextFloat();
        HoaDon hoaDon = new HoaDon(maHoaDon,maKhachHang,maSanPham,soLuong,ngayMua,donGia);
        return hoaDon;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", maSanPham='" + maSanPham + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", ngayMua=" + ngayMua +
                ", donGia=" + donGia +
                ", tongTien=" + tongTien +
                '}';
    }

    public void luuVaoFile(){
        String tenFile = "src\\file\\HoaDon.svc";
        try {
            File file = new File(tenFile);
            if (file.createNewFile()){
                System.out.println("--------Create new file HoaDon.csv------");
            }
            FileWriter fileWriter = new FileWriter(tenFile);

            fileWriter.write(this.toString());

            fileWriter.close();
            System.out.println("--------Đã ghi Sach vào file HoaDon.csv-------");

        } catch (Exception e){
            System.out.println("----------------------");
            System.out.println(e);
            System.out.println("-----------------------");
        }
    }
}
