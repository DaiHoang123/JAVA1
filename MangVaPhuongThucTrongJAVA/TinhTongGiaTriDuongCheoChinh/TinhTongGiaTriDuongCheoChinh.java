import java.util.Scanner;

public class TinhTongGiaTriDuongCheoChinh{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong va cot cho ma tran vuong: ");
        int input = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[input][input];
        
        //nhap gia tri cho ma tran vuong
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print("Nhap gia tri cho phan tu "+(i+1)+"-"+(j+1)+"): ");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        //tinh tong cac gia tri o duong cheo chinh
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i][i];
        }

        //hien thi ket qua
        System.out.println("Tong cac gia tri o duong cheo chinh la "+sum);
    }
}