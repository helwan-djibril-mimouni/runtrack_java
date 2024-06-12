package jour03.job02;

public class FixedArray {
    public static void main(String[] args) {
        int[] monTableau = {12, 6, 76, 89};
        for (int i : monTableau) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i] = i;
        }
        for (int i : monTableau) {
            System.out.print(i + " ");
        }
    }
}
