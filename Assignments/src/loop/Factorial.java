package loop;

import java.util.Scanner;

public class Factorial {


        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            long factorial = 1;
            int i = number;
            while (i > 1) {
                factorial *= i;
                i--;
            }
            System.out.println("Factorial of " + number + " is " + factorial);


        }
}
