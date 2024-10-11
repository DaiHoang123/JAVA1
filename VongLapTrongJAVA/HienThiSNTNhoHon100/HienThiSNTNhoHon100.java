public class HienThiSNTNhoHon100{
    public static void main(String[] args) {
        System.out.println("Cac SNT nho hon 100: ");
        for (int i = 2 ; i < 100 ; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}