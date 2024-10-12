import java.util.Scanner;

public class TinhTongSoOCotXacDinh{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dong: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so cot: ");
        int col = Integer.parseInt(sc.nextLine());

        //khoi tao mang hai chieu
        int[][] arr = new int[row][col];

        //nhap gia tri cho mang 2 chieu
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print("Nhap gia tri cho phan tu "+(i+1)+"-"+(j+1)+" : ");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        System.out.print("Nhap so cot muon tinh tong (1-"+col+"): ");

        //cho user chon so thu tu cua cot muon sum
        int inputCol = Integer.parseInt(sc.nextLine());

        int sumCol = 0;

        // sum gia tri cua cac phan tu trong cot ma user da nhap
        for (int[] arr1 : arr) {
            sumCol += arr1[inputCol-1];
        }

        System.out.print("Tong cua cot da chon la "+sumCol);

        sc.close();
    }
}