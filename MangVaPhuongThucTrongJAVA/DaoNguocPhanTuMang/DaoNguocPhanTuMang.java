import java.util.Scanner;

public class DaoNguocPhanTuMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int count = 0;

        System.out.println("Nhập vào tối đa 20 phần tử (nhập -1 để kết thúc):");
        while (count < 20) {
            System.out.print("Nhập phần tử thứ " + (count + 1) + ": ");
            int input = sc.nextInt();
            if (input == -1) {
                break;
            }
            arr[count] = input;
            count++;
        }

        for (int i = 0; i < count / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[count - i - 1];
            arr[count - i - 1] = temp;
        }

        System.out.println("Mảng sau khi đảo ngược:");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}