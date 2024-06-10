package Jour12;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = myObj.nextLine();
        System.out.println("Enter last string");
        String s2 = myObj.nextLine();
        System.out.println("Before swap : s1 = " + s1 + ", s2 = " + s2);
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("After swap : s1 = " + s1 + ", s2 = " + s2);
        myObj.close();
    }
}
