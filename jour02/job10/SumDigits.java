package jour02.job10;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        String str = myObj.nextLine();
        int num = Integer.parseInt(str);
        int temp = num;
        int sum = 0;
        while (temp != 0){
            sum += temp%10;
            temp /= 10;
        }
        System.out.println("Sum of digits of " + num + " : " + sum);
        myObj.close();
    }
}
