
import java.util.Scanner;

public class LopHinhChuNhat{
    double width, height;

    public LopHinhChuNhat(){}

    public LopHinhChuNhat(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getS(){
        return this.width * this.height;
    }

    public double getC(){
        return (this.width + this.height) * 2;
    }

    public String display(){
        return "Hinh chu nhat co chieu dai "+this.width+" va chieu rong "+this.height;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        double width = Double.parseDouble(sc.nextLine());
        System.out.print("nhap chieu rong: ");
        double height = Double.parseDouble(sc.nextLine());
        LopHinhChuNhat HCN = new LopHinhChuNhat(width,height);
        System.out.println(HCN.display());
        System.out.println("Dien tich la "+HCN.getS());
        System.out.println("Chu vi la "+HCN.getC());
    }
}