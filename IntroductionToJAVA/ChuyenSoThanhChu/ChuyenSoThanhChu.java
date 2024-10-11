import java.util.Scanner;

public class ChuyenSoThanhChu{

    public static String oneCharacter(int num){
        return switch (num) {
            case 0 -> "zero";
            case 1 -> "one"; 
            case 2 -> "two"; 
            case 3 -> "three"; 
            case 4 -> "four"; 
            case 5 -> "five"; 
            case 6 -> "six"; 
            case 7 -> "seven"; 
            case 8 -> "eight"; 
            default -> "nine"; 
        };
    }

    public static String twoCharacter(int num){
        if(num>=20 && num <= 29){
            int donVi = num - 20;
            return switch(donVi){
                case 0 -> "twenty-"+oneCharacter(donVi);
                case 1 -> "twenty-"+oneCharacter(donVi);
                case 2 -> "twenty-"+oneCharacter(donVi);
                case 3 -> "twenty"+oneCharacter(donVi);
                case 4 -> "twenty"+oneCharacter(donVi);
                case 5 -> "twenty"+oneCharacter(donVi);
                case 6 -> "twenty"+oneCharacter(donVi);
                case 7 -> "twenty"+oneCharacter(donVi);
                case 8 -> "twenty"+oneCharacter(donVi);
                default -> "twenty-nine";
            };
        }else if(num>=30 && num <= 39){
            int donVi = num - 30;
            return switch(donVi){
                case 0 -> "thirty-"+oneCharacter(donVi);
                case 1 -> "thirty-"+oneCharacter(donVi);
                case 2 -> "thirty-"+oneCharacter(donVi);
                case 3 -> "thirty"+oneCharacter(donVi);
                case 4 -> "thirty"+oneCharacter(donVi);
                case 5 -> "thirty"+oneCharacter(donVi);
                case 6 -> "thirty"+oneCharacter(donVi);
                case 7 -> "thirty"+oneCharacter(donVi);
                case 8 -> "thirty"+oneCharacter(donVi);
                default -> "thirty-nine";
            };
        }else if(num>=50 && num <= 59){
            int donVi = num - 50;
            return switch(donVi){
                case 0 -> "fifty-"+oneCharacter(donVi);
                case 1 -> "fifty-"+oneCharacter(donVi);
                case 2 -> "fifty-"+oneCharacter(donVi);
                case 3 -> "fifty"+oneCharacter(donVi);
                case 4 -> "fifty"+oneCharacter(donVi);
                case 5 -> "fifty"+oneCharacter(donVi);
                case 6 -> "fifty"+oneCharacter(donVi);
                case 7 -> "fifty"+oneCharacter(donVi);
                case 8 -> "fifty"+oneCharacter(donVi);
                default -> "fifty-nine";
            };
        }else{
            String st = Integer.toString(num);
            int firstChar = st.charAt(0) - '0';
            int secondChar = st.charAt(1) - '0';
            return oneCharacter(firstChar)+"ty-"+oneCharacter(secondChar);
        }
    }

    public static String threeCharacter(int num){
        String st = Integer.toString(num);
        int firstChar = st.charAt(0) - '0';
        int secondChar = st.charAt(1) - '0';
        int thirChar = st.charAt(2) - '0';
        System.out.println(firstChar);
        System.out.println(secondChar);
        System.out.println(thirChar);
        int temp = (secondChar*10)+thirChar;
        if((temp>=20 && temp<=29)||(temp>=30 && temp<=39)||(temp>=10 && temp<=19)||(temp>=50 && temp<=59)){
            return oneCharacter(firstChar)+" hundred and "+twoCharacter(temp);
        }else{
            return oneCharacter(firstChar)+" hundred and "+oneCharacter(secondChar)+"ty-"+oneCharacter(thirChar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong co ba chu so: ");
        int num = Integer.parseInt(sc.nextLine());
        String result;
        if(num>=0 && num <=9){
            result = oneCharacter(num);
        }else if(num>=10 && num<=99){
            result = twoCharacter(num);
        }else{
            result = threeCharacter(num);
        }
        System.out.println(result);
        sc.close();
    }
}