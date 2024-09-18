package oddEven;

import java.util.Scanner;

public class oddEvnecheck {

        public static void main(String[] args){
           // isoddorEven(2);
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }

        }


}
