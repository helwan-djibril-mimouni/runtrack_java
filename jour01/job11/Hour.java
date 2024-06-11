package job11;

import java.util.Scanner;

public class Hour {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of minutes");
        String minutes = myObj.nextLine();
        int min = Integer.parseInt(minutes);
        int hour = min/60;
        System.out.println("Amount of time : " + hour + ":" + min%60);
        myObj.close();
    }
}
