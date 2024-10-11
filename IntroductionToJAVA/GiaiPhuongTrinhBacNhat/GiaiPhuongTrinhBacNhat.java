
import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input a: ");
        double a = Integer.parseInt(sc.nextLine());
        System.out.println("input b: ");
        double b = Integer.parseInt(sc.nextLine());
        System.out.println("input c: ");
        double c = Integer.parseInt(sc.nextLine());
        sc.close();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}