import java.util.Scanner;

public class MaxAndMinUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE; // 0;
        int max = Integer.MIN_VALUE; // 0;
       // boolean flag = true;
        while (true) {
            System.out.println("Enter number : ");
            boolean isAsInt = scanner.hasNextInt();
            if(isAsInt){
                int number = scanner.nextInt();
//                if(flag) {
//                    flag = false;
//                    max =  number;
//                    min = number;
//                }
                if(number < min) {
                    min = number;
                }
                if(number > max) {
                    max = number;
                }

            }else {
             break;
            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min + "  Max = "+max);
        scanner.close();
    }
}
