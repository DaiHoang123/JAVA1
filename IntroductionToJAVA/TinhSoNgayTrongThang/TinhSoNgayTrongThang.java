import java.util.Scanner;

public class TinhSoNgayTrongThang {

    public static void getDay(int a){
        switch (a) {
            case 2:
                System.out.println("Thang "+a+" co 28 hoac 29 ngay!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang "+a+" co 31 ngay!");
                break;
            default:
                System.out.println("Thang "+a+" co 30 ngay!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        int month = Integer.parseInt(sc.nextLine());
        sc.close();
        getDay(month);
    }

    
}