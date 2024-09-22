package SwitchCase;

import java.util.*;

public class SwitchCalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char continueCalc;
        do {
            System.out.println("Enter any two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("for Addition Enter +:  Substraction Enter -: Division /: Multiplication *: Reminder %  ");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println("Addition of a and b is " + (a + b));
                    break;
                case '-':
                    System.out.println("Substraction of a and b is " + (a - b));
                    break;
                case '*':
                    System.out.println("Multiplication of a and b is " + (a * b));
                    break;
                case '/':
                    System.out.println("Division of a and b is " + (a / b));
                    break;
                case '%':
                    System.out.println("Reminder of and b is " + (a % b));
                    break;
                default:
                    System.out.println("Invalid button");
            }
            System.out.println("Do you want to continue type Y for yes ");
            continueCalc = sc.next().charAt(0);
        }
            while (continueCalc == 'y' || continueCalc == 'Y') ;



    }
}