import java.util.Scanner;

public class TimUocChungLonNhat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = sc.nextInt();
        int uocChung = uocChungLonNhat(a, b);
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + uocChung);
        sc.close();
    }

    public static int uocChungLonNhat(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}