package Jour10;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first name");
        String fName = myObj.nextLine();
        System.out.println("Enter last name");
        String lName = myObj.nextLine();
        String result = fName + lName;
        System.out.println("User's name is: " + result);
        myObj.close();
    }
}
