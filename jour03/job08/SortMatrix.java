package jour03.job08;

import java.util.Arrays;

public class SortMatrix {
    public static void main(String[] args) {
        int[][] tableau = {
            {5, 9, 3},
            {7, 2, 8},
            {1, 6, 4}
        };
        int[] arr = new int[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[3*i + j] = tableau[i][j];
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tableau[i][j] = arr[3*i + j];
            }
        }
        for (int[] is : tableau) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
