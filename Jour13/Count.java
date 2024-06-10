package Jour13;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        String str = myObj.nextLine();
        int num = Integer.parseInt(str);
        for (int i = 1; i < num; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(num);
        myObj.close();
    }
}
