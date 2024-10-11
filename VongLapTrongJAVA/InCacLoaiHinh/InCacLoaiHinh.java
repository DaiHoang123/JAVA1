import java.util.Scanner;

public class InCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (bottom-left)");
            System.out.println("3. Print the square triangle (top-left)");
            System.out.println("4. Print isosceles triangle");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printRectangle(6, 7); // Chiều dài 6, chiều rộng 7
                    break;
                case 2:
                    printSquareTriangleBottomLeft(5); // Chiều dài 5
                    break;
                case 3:
                    printSquareTriangleTopLeft(5); // Chiều dài 5
                    break;
                case 4:
                    printIsoscelesTriangle(5); // Chiều cao 5
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        
        sc.close();
    }

    public static void printRectangle(int length, int width) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangleBottomLeft(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangleTopLeft(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printIsoscelesTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
