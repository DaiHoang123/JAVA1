
import java.util.Scanner;

public class ChuyenDoiNhietDo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai nhiet do (C hoac F):");
        String type = sc.nextLine();
        System.out.println("Nhap vao gia tri nhiet do:");
        double temperature = sc.nextDouble();

        if (type.equalsIgnoreCase("C")) {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println(temperature + " do C bang " + fahrenheit + " do F");
        } else if (type.equalsIgnoreCase("F")) {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println(temperature + " do F bang " + celsius + " do C");
        } else {
            System.out.println("Chi duoc nhap loại nhiet do la C hoac F!");
        }
    }
}