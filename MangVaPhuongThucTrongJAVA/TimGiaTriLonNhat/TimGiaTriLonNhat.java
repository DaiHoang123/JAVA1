import java.util.Scanner;

public class TimGiaTriLonNhat{
    public static void main(String[] args) {
        int len;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap do dai mang (tu 1 toi 20): ");
            len = Integer.parseInt(sc.nextLine());
        }while(len>20 || len<1);
        int[] arr = new int[len];
        for(int i = 0 ; i < len ; i++){
            System.out.println("Nhap gia tri cho phan tu thu "+(i+1)+" :");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        int result = findMax(arr);
        System.out.println("Gia tri lon nhat trong mang la: "+result);
        sc.close();
    }

    public static int findMax(int[] arr){
        int temp = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if (temp < arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }
}