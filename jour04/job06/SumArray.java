package jour04.job06;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        ArrayList<Integer> arr = new ArrayList<>();
        boolean stop = false;
        Scanner myObj = new Scanner(System.in);
        while (!stop) {
            try {
                System.out.println("Enter number in array (input invalid to stop)");
                String str = myObj.nextLine();
                int num = Integer.parseInt(str);
                arr.add(num);
            } catch (NumberFormatException e) {
                stop = true;
            }
        }
        myObj.close();
        long inputTime = System.nanoTime();
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        System.out.println("Sum : " + sum);
        long stopTime = System.nanoTime();
        System.out.println("Execution time : " + ((stopTime-inputTime)/1000000) + "ms");
        System.out.println("Total time : " + ((stopTime-startTime)/1000000) + "ms");
    }
}
