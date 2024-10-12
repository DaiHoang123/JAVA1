import java.util.Arrays;
import java.util.Scanner;

public class GopMang{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{6,7,8,9,10};
        int[] arr3 = gop(arr, arr2);
        System.out.println("Mang sau khi gop:" );
        System.out.println(Arrays.toString(arr3));
        sc.close();
    }

    public static int[] gop(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }
}
