package jour04.job05;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number to count");
        String str = myObj.nextLine();
        long inputTime = System.nanoTime();
        int num = Integer.parseInt(str);
        myObj.close();
        FirstThread ft = new FirstThread(num);
        SecondThread st = new SecondThread(num, ft);
        ft.run();
        st.run();
        long stopTime = System.nanoTime();
        System.out.println("Execution time : " + ((stopTime-inputTime)/1000000) + "ms");
        System.out.println("Total time : " + ((stopTime-startTime)/1000000) + "ms");
    }
}
