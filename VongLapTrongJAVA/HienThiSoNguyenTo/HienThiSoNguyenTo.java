import java.util.Scanner;

public class HienThiSoNguyenTo{
    public static void main(String[] args) {
        int count = 1;
        int i = 2;
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to muon hien thi: ");
        int Number = Integer.parseInt(sc.nextLine());
        while(count <= Number){
            check = isPrime(i);
            if(check){
                count++;
                System.out.print(i+"  ");
            }
            i++;
        }
        sc.close();
    }

    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}