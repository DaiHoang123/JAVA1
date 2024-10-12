import java.util.Scanner;

public class DemSoLuongSinhVienThiDo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Nhap do dai cua mang: ");
        int len = Integer.parseInt(sc.nextLine());
        int[] arrMark = new int[len];
        for(int i = 0 ; i < len ; i++){
            System.out.print("Nhap diem cho thi sinh thu "+(i+1)+" : ");
            arrMark[i] = Integer.parseInt(sc.nextLine());
            if(arrMark[i] >= 5){
                count++;
            }
        }
        System.out.print("Danh sach diem: ");
        for(int mark : arrMark){
            System.out.print(mark+"  ");
        }
        System.out.println();
        System.out.println("So luong thi sinh thi do la "+count);
        sc.close();
    }
}