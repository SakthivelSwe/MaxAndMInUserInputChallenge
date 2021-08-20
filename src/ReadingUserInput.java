import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            int order=count + 1;
            System.out.println("Enter Number #"+order+" : ");

            boolean isAsInt = scanner.hasNextInt();

            if(isAsInt){
                int number = scanner.nextInt();
                if(number > 0){
                    count++;
                    sum += number;
                    if(count == 10){
                        break;
                    }
                }

            }else {
                System.out.println("Invalid Value");
            }
            scanner.nextLine();

        }
        System.out.println(sum);
        scanner.close();
    }
}
