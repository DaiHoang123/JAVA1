import java.util.Scanner;

public class ChuyenSoThanhChu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong co ba chu so: ");
        String num = sc.nextLine();
        for (char n : num.toCharArray()){
            System.out.println(n);
        }
    }
}