package jour02.job03;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        String str = myObj.nextLine();
        int num = Integer.parseInt(str);
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "x" + num + " = " + (i*num));
        }
        myObj.close();
    }
}
