
import java.util.Scanner;

public class ChuyenDoiTienTe{
    public static void main(String[] args) {
        int tiGia = 0;
        int USD = 0;
        System.out.println("Nhap ti gia: ");
        Scanner sc = new Scanner(System.in);
        tiGia = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so tien USD: ");
        USD = Integer.parseInt(sc.nextLine());
        System.out.println("So tien VND sau khi doi la: "+tiGia*USD);
        sc.close();
    }
}