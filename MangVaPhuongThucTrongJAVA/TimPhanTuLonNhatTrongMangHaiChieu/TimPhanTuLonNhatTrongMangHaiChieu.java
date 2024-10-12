import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so cot: ");
        int col = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][col];
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.print("Nhap gia tri cho vi tri "+i+"-"+j+" : ");
                int input = Integer.parseInt(sc.nextLine());
                arr[i][j] = input;
            }
        }

        int max = findMax(arr);

        System.out.println("Gia tri lon nhat trong mang da nhap: "+max);

        sc.close();
    }

    public static int findMax(int[][] arr){
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}