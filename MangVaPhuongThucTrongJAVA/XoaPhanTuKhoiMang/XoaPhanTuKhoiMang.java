import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang{
    public static void main(String[] args) {
        int index = 0;
        boolean check = false;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[arr.length-1];
        System.out.println("Nhap gia tri muon xoa");
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        //tim gia tri da nhap trong mang, neu co thi lay index va bien check = true
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==input){
                index = i;
                check = true;
                break;
            }
        }

        //kiem tra bien check, neu true thi chay, khong thi thoi
        if(check){
            //truong hop gia tri tim thay o dau cua mang arr
            if(index == 0){
                for(int i = 0 ; i < arr2.length ; i++){
                    arr2[i] = arr[i+1];
                }
            //truong hop gia tri tim thay o cuoi cua mang arr
            }else if(index == (arr.length-1)){
                for(int i = 0 ; i < arr2.length ; i++){
                    arr2[i] = arr[i];
                }
            //truong hop gia tri tim thay o giua mang arr
            }else{
                for(int j = 0 ; j < arr2.length ; j++){
                    if(j != index){
                        arr2[j] = arr[j];
                    }else{
                        break;
                    }
                }
                for(int j = index ; j < arr2.length ; j++){
                    arr2[j] = arr[j+1];
                }
            }
            //tao mang arr2 xong thi hien thi mang moi ra man hinh
            System.out.println("Mang moi la: "+Arrays.toString(arr2));
        }else{
            //neu khong tim thay gia tri trong mang thi hien thi loi
            System.out.println("Khong tim thay gia tri can xoa!");
        }
        sc.close();
    }
}