public class DanhMuc {
    private String spSach;
    private String spDochoi;
    private String spDungcu;

    public DanhMuc(String spSach, String spDochoi, String spDungcu) {
        this.spSach = spSach;
        this.spDochoi = spDochoi;
        this.spDungcu = spDungcu;
    }

    public DanhMuc() {
    }

    public String getSpSach() {
        return spSach;
    }

    public void setSpSach(String spSach) {
        this.spSach = spSach;
    }

    public String getSpDochoi() {
        return spDochoi;
    }

    public void setSpDochoi(String spDochoi) {
        this.spDochoi = spDochoi;
    }

    public String getSpDungcu() {
        return spDungcu;
    }

    public void setSpDungcu(String spDungcu) {
        this.spDungcu = spDungcu;
    }
}
