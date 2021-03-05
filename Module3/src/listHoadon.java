import java.util.ArrayList;
import java.util.Iterator;

public class listHoadon {
    ArrayList<HoaDon> hoaDons;

    public listHoadon() {
        hoaDons = new ArrayList<>();
    }

    public listHoadon(ArrayList<HoaDon> hoaDons) {
        this.hoaDons = hoaDons;
    }

    public ArrayList<HoaDon> getHoaDons() {
        return hoaDons;
    }

    public void setHoaDons(ArrayList<HoaDon> hoaDons) {
        this.hoaDons = hoaDons;
    }

    public HoaDon timHoaDonTheoMaKhachHang(String maKH){
        if (hoaDons == null) {
            System.out.println("Khong co hoa don!");
        } else {
            for (HoaDon hoadon :
                    hoaDons) {
                if (hoadon.getMakh() == maKH) {
                    return hoadon;
                }
            }
        }
        return null;
    }

    public void themHoaDon(HoaDon hoaDon){
        this.hoaDons.add(hoaDon);
    }

    public void hienThiTaCaHoaDon(){
        if (hoaDons == null){
            System.out.println("Khong co hoa don");
        } else {
            Iterator<HoaDon> iterator = hoaDons.iterator();
            HoaDon hoaDon;
            while (iterator.hasNext()) {
                hoaDon = iterator.next();

            }
        }
    }

    public void luuTatCaVaoFile(){
        for (HoaDon hoaDon :
                hoaDons) {
            hoaDon.lu;
        }
    }
}
