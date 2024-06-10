package Jour14;

import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter num1");
        String str = myObj.nextLine();
        int num1 = Integer.parseInt(str);        
        System.out.println("Enter num1");
        str = myObj.nextLine();
        int num2 = Integer.parseInt(str);
        int result = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + result);
        myObj.close();
    }

    public static int add(int x, int y){
        return x+y;
    }
}
