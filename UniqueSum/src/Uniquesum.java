import java.util.Scanner;

public class Uniquesum {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Input an integer:");
        int num1 = scanner.nextInt();

        System.out.println("Input a second integer:");
        int num2 = scanner.nextInt();

        System.out.println("Input a third integer:");
        int num3 = scanner.nextInt();

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