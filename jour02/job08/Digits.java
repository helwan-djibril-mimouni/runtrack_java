package jour02.job08;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        String str = myObj.nextLine();
        int num = Integer.parseInt(str);
        int temp = num;
        int digits = 0;
        while (temp != 0){
            digits++;
            temp /= 10;
        }
        System.out.println("Number of digits in " + num + " : " + digits);
        myObj.close();
    }
}
