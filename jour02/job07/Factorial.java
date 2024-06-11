package jour02.job07;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        String str = myObj.nextLine();
        int num = Integer.parseInt(str);
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " is : " + factorial);
        myObj.close();
    }
}
