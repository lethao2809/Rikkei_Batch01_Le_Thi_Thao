import java.util.ArrayList;
import java.util.Iterator;

public class listSanpham {
    ArrayList<SanPham> sanphams;

    public listSanpham() {
        sanphams = new ArrayList<>();
    }

    public ArrayList<SanPham> getSanPhams() {
        return sanphams;
    }

    public void setSanPhams(ArrayList<SanPham> sanPhams) {
        this.sanphams = sanphams;
    }

    public void themSanPham(SanPham sanPham){
        this.sanphams.add(sanPham);
    }

    public void xoaSanPham(SanPham sanPham){
        this.sanphams.remove(sanPham);
    }

    public SanPham timSanPhamTheoMaSP(String maSP){
        Iterator<SanPham> iterator = getSanPhams().iterator();
        SanPham sanPham;
        while (iterator.hasNext()){
            sanPham = iterator.next();
            if (sanPham.getMaSp() == maSP){
                return sanPham;
            }
        }
        return null;
    }

    public void hienThiTatCaSanPham(){
        Iterator<SanPham> iterator = getSanPhams().iterator();
        SanPham sanPham;
        while (iterator.hasNext()){
            sanPham = iterator.next();
            sanPham.hienthithongtin();
        }
    }

    public void hienThiTatCaSach(){
        Iterator<SanPham> iterator = getSanPhams().iterator();
        SanPham sanPham;
        while (iterator.hasNext()){
            sanPham = iterator.next();
            if (sanPham instanceof Sach)
                sanPham.hienthithongtin();
        }
    }

    public void hienThiTatDoChoiTreEm(){
        Iterator<SanPham> iterator = getSanPhams().iterator();
        SanPham sanPham;
        while (iterator.hasNext()){
            sanPham = iterator.next();
            if (sanPham instanceof DoChoi)
                sanPham.hienthithongtin();
        }
    }

    public void hienThiTatCaDoDungHocTap(){
        Iterator<SanPham> iterator = getSanPhams().iterator();
        SanPham sanPham;
        while (iterator.hasNext()){
            sanPham = iterator.next();
            if (sanPham instanceof DungCu)
                sanPham.hienthithongtin();
        }
    }

    public void luuTatCaVaoFile(){
        for (SanPham sanPham :
                sanphams) {
            if (sanPham instanceof Sach)
                ((Sach) sanPham).luuvaofile();
        }
    }
}
