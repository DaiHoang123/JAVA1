
import java.text.NumberFormat;
import java.util.Scanner;

public class TinhLaiSuat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien gui: ");
        long soTien = Long.parseLong(sc.nextLine());
        System.out.println("Nhap lai suat: ");
        float laiSuat = Float.parseFloat(sc.nextLine());
        System.out.println("Nhap so thang gui tien: ");
        int soThang = Integer.parseInt(sc.nextLine());
        int result = calculate(soTien, laiSuat, soThang);
        System.out.println("So tien lai la: "+NumberFormat.getInstance().format(result)+" VND");
        sc.close();
    }

    public static int calculate(long soTien, float laiSuat, int soThang){
        System.out.println("so tien: "+soTien);
        System.out.println("lai suat: "+laiSuat);
        System.out.println("so thang: "+soThang);
        return Math.round(soTien * ((laiSuat/12)/100) * soThang);
    }
}