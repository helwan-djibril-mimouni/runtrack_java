package jour04.job04;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number to count");
        String str = myObj.nextLine();
        long inputTime = System.nanoTime();
        int num = Integer.parseInt(str);
        myObj.close();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        long stopTime = System.nanoTime();
        System.out.println("Execution time : " + ((stopTime-inputTime)/1000000) + "ms");
        System.out.println("Total time : " + ((stopTime-startTime)/1000000) + "ms");
    }
}
