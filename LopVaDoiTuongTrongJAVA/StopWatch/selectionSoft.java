
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class selectionSoft extends StopWatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = null;

        //hien thi 3 lua chon cho nguoi dung
        System.out.println("Moi lua chon: ");
        System.out.println("1. Tu nhap do dai mang va cac phan tu cua mang");
        System.out.println("2. Tu tao mang gom 100.000 phan tu ngau nhien nho hon 1.000.000");
        System.out.println("3. Thoat chuong trinh");
        int input = Integer.parseInt(sc.nextLine());

        //xu ly mang theo lua chon cua nguoi dung
        switch(input){

            //case 1: nguoi dung muon tu tao mang
            case 1:
            {
                //cho nguoi dung nhap do dai mang
                System.out.print("nhap do dai mang: ");
                int n = Integer.parseInt(sc.nextLine());
                //tao mang arr voi do dai do nguoi dung nhap
                arr = new int[n];
                //nhap lan luot cac phan tu vao mang
                for(int i = 0 ; i < n ; i++){
                    System.out.print("Nhap gia tri thu "+(i+1)+" : ");
                    arr[i] = Integer.parseInt(sc.nextLine());
                }
            }; break;

            //case 2: nguoi dung muon tao mang auto
            case 2:{
                //tao bien rd co kieu du lieu Random
                Random rd = new Random();
                //tao mang arr voi do dai 100000 phan tu
                arr = new int[100000];
                //tao mang voi 100000 phan tu ngau nhien
                for(int i = 0 ; i < 100000 ; i++){
                    arr[i] = rd.nextInt(1000000);
                }
            };break;

            //case 3: thoat chuong trinh
            default: System.exit(3);
        }

        //tao bien st voi kieu du lieu la StopWatch, dong thoi lay thoi gian bat dau
        StopWatch st = new StopWatch();

        //sap xep mang arr
        soft(arr);

        //lay thoi gian ket thuc sap xep
        st.end();

        //lay thoi gian chay chuong trinh
        long time = st.getElapsedTime();

        //hien thi ket qua
        System.out.println("Mang da sap xep: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Thoi gian sap xep la "+time+" mili giay");
    }

    public static void soft(int[] arr){
        //ham sap xep theo tu lon den be
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
