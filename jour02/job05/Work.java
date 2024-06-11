package jour02.job05;

import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        String str = myObj.nextLine();
        int num = Integer.parseInt(str);
        if (num < 16){
            System.out.println("Too young");
        }
        else if (num < 55){
            System.out.println("Welcome to the team");
        }
        else if (num < 67){
            System.out.println("Kind of old");
        }
        else{
            System.out.println("Too old");
        }
        myObj.close();
    }
}
