
import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int arrLen = arr.length;
        int[] arr2 = new int[arrLen+1];
        int arr2Len = arr2.length;
        System.out.println("Nhap gia tri muon them vao mang (chi nhap so nguyen): ");
        int input = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vi tri muon them vao mang (1-"+(arrLen+1)+"): ");
        int index = Integer.parseInt(sc.nextLine());

        if(index >= 1 && index <= (arrLen+1)){
            if(index == 0){
                arr2[0] = input;
                for(int i = 0 ; i < arrLen ; i++){
                    arr2[i+1] = arr[i];
                }
            }else if(index == (arrLen+1)){
                for(int i = 0 ; i < arrLen ; i++){
                    arr2[i] = arr[i];
                }
                arr2[arr2Len-1] = input;
            }else{
                for(int i = 0 ; i < (index-1) ; i++){
                    arr2[i] = arr[i];
                }
                arr2[index-1] = input;
                for(int j = index ; j < arr2Len ; j++){
                    arr2[j] = arr[j-1];
                }
            }
            System.out.println("Mang sau khi sua doi: ");
            System.out.println(Arrays.toString(arr2));
        }else{
            System.out.println("vi tri khong hop le!");
        }
        sc.close();
    }
}