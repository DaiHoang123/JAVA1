import java.util.Scanner;

public class HienThiLoiChao{
    public static void main(String[] args){
    System.out.println("Enter your name: ");
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    sc.close();
    System.out.println("Hello: "+st);
    }
}