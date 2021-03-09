import java.util.ArrayList;

public class listSach {
    ArrayList<Sach> Sachs;

    public listSach() {
        Sachs = new ArrayList<Sach>();
    }

    public listSach(ArrayList<Sach> sachs) {
        Sachs = sachs;
    }

    public ArrayList<Sach> getSachs() {
        return Sachs;
    }

    public void setSachs(ArrayList<Sach> sachs) {
        Sachs = sachs;
    }

    public void luuTatCaVaoFile(){
        for (Sach sach :
                Sachs) {
            sach.luuVaoFile();
        }
    }
}
