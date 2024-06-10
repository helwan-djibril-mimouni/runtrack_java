package Jour06;

public class ExerciceVariables {
    public static void main(String[] args) {
        int x = 13;
        int y = 7;
        System.out.println("x = " + x + ", y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + ", y = " + y);
    }
}
