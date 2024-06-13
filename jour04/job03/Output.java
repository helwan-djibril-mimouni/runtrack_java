package jour04.job03;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Random;
import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of characters");
        String str = myObj.nextLine();
        long inputTime = System.nanoTime();
        int num = Integer.parseInt(str);
        myObj.close();
        Random randNum = new Random();        
        try {  
            OutputStream os = new FileOutputStream("jour04/job03/output.txt");
            FirstThread ft = new FirstThread(os);
            for (int i = 0; i < num/2; i++) {
                int n = randNum.nextInt(26) + 97;
                char c = (char)n;
                ft.changeChar(c);
                ft.run();
            }
            SecondThread st = new SecondThread(os);
            for (int i = 0; i < num/2; i++) {
                int n = randNum.nextInt(26) + 97;
                char c = (char)n;
                st.changeChar(c);
                st.run();
            }
            os.close();
        }
        catch (Exception ex) {  
            ex.printStackTrace();  
        }
        long stopTime = System.nanoTime();
        System.out.println("Execution time : " + ((stopTime-inputTime)/1000000) + "ms");
        System.out.println("Total time : " + ((stopTime-startTime)/1000000) + "ms");
    }
}
