import java.util.Scanner;

public class Uniquesum {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int num1 = 0, num2 = 0 , num3 = 0;
        boolean numTrue = false;
        while (!numTrue) {
            try {
                System.out.println("Input an integer:");
                num1 = scanner.nextInt();
                System.out.println("Input a second integer:");
                num2 = scanner.nextInt();
                System.out.println("Input a third integer:");
                num3 = scanner.nextInt();
                numTrue = true;
            }
            catch (Exception e) {
                System.out.println("You must enter an integer.");
                scanner.nextLine();
            }
        }

        if (num1 == num2 && num1 == num3) {
            num1 = num2 = num3 =0;
        } else if (num1 == num2) {
            num1 = num2 =0;
        } else if (num1 == num3) {
            num1 = num3 = 0;
        } else if (num2 == num3) {
            num2 = num3 = 0;
        }

        System.out.println("Unique sum: " + (num1 + num2 + num3));
    }
}