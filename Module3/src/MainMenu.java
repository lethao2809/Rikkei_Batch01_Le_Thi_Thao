import java.util.Scanner;

public class MainMenu {
    public static void MenuColtrol {
        System.out.println("---------------------");
        System.out.println("--1. Thêm sản phẩm--");
        System.out.println("--2. Têm đơn hàng --");
        System.out.println("--3. Hiển thị thông tin sản phẩm--");
        System.out.println("--4. Hiển thị danh sách đơn hàng--");
        System.out.println("--5. Tìm kiếm--");
        System.out.println("-----------------------------");
        System.out.println("Chọn chức năng ");
        Scanner s = new Scanner(System.in);
        int chon = s.nextInt();
        switch (chon){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.exit(0);
        }
    }

}
