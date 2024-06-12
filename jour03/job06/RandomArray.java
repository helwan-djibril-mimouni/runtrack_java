package jour03.job06;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = randomNumbers.nextInt(100)+1;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
