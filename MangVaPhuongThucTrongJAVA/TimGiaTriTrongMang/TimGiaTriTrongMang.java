import java.util.Scanner;

public class TimGiaTriTrongMang{
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean check = false;
        System.out.println("Nhap gia tri muon tim: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(int i = 0 ; i < students.length ; i++){
            if (students[i].equalsIgnoreCase(input)){
                check = true;
                System.out.println("Gia tri da nhap o vi tri thu "+ (i+1) +" trong mang");
                break;
            }
        }
        if(!check){
            System.out.println("Khong tim thay gia tri da nhap!");
        }
    }
}