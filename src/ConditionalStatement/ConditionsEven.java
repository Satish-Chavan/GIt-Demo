package ConditionalStatement;

import java.util.*;

public class ConditionsEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Even Number" + x);
        }
        else{
            System.out.println("Odd Number" + x);
        }
        }
}
