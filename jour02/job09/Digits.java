package jour02.job09;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        String str = myObj.nextLine();
        int num = Integer.parseInt(str);
        int temp = num;
        int first = num%10;
        int last = num%10;
        while (temp != 0){
            first = temp%10;
            temp /= 10;
        }
        System.out.println("First digit of " + num + " : " + first);
        System.out.println("Last digit of " + num + " : " + last);
        myObj.close();
    }
}
