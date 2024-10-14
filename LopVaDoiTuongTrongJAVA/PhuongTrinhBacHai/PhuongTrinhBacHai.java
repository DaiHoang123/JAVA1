import java.util.Scanner;

public class PhuongTrinhBacHai{
    private double a;
    private double b;
    private double c;

    public PhuongTrinhBacHai(){}

    public PhuongTrinhBacHai(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public double getC(){
        return this.c;
    }

    public double getDelta(){
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double root1(){
        double delta = this.getDelta();
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double root2(){
        double delta = this.getDelta();
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap b: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap c: ");
        int c = Integer.parseInt(sc.nextLine());
        PhuongTrinhBacHai PTBacHai = new PhuongTrinhBacHai(a,b,c);
        double delta = PTBacHai.getDelta();
        
        if(delta<0){
            System.out.println("Phuong trinh vo nghiem1");
        }else if(delta == 0){
            System.out.println("Phuong trinh co nghiem kep la "+((b/(2*a))*-1));
        }else{
            double root1 = PTBacHai.root1();
            double root2 = PTBacHai.root2();
            System.out.println("Phuong trinh co hai nghiem: ");
            System.out.println(" - Nghiem 1 la "+root1);
            System.out.println(" - Nghiem 2 la "+root2);
        }
    }
}