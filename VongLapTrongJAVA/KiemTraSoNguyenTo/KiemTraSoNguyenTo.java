import java.util.Scanner;

public class KiemTraSoNguyenTo{
    public static void main(String[] args) {
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so de kiem tra: ");
        int inputNum = Integer.parseInt(sc.nextLine());
        if(inputNum < 2){
            System.out.println("So da nhap khong phai SNT");
        }else{
            check = isSNT(inputNum);
            if(check){
                System.out.println("So da nhap la SNT");
            }else{
                System.out.println("So da nhap khong phai la SNT");
            }
        }
        sc.close();
    }

    public static boolean isSNT(int num){
        for (int i = 2 ; i < Math.sqrt(num) ; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}