import java.util.Scanner;

public class DemKyTuTrongChuoi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ki tu: ");
        String str = sc.nextLine();
        System.out.print("Nhap vao ky tu muon tim: ");
        char input = sc.nextLine().charAt(0);
        int count = 0;
        for(char cha : str.toCharArray()){
            if(cha == input){
                count++;
            }
        }
        if(count != 0){
            System.out.println("so lan ky tu "+input+" xuat hien la "+count);
        }else{
            System.out.println("Khong tim thay ky tu trong chuoi");
        }
    }
}