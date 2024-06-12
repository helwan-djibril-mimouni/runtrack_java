package jour03.job07;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrice1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrice2 = {
            {100, 200, 300},
            {400, 500, 600},
            {700, 800, 900}
        };
        for (int[] is : matrice1) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((matrice1[i][j] + matrice2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
