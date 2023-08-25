package day1_assignment;
import java.util.Scanner;

public class printAnInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("The entered integer is: " + number);
    }
}
