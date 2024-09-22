
package com.apnacollage;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
//        String name = sc.nextLine(); for print full name
//                      sc.nextInt()   for Integer
//                       sc.nextFloat();   for Float values
        System.out.println(name);
        int a = 10;
        int b = 25;
        int sum = a + b;
        System.out.println(sum);

        int diff = a - b;
        System.out.println(diff);

        int mul = a * b;
        System.out.println(mul);
    }
}