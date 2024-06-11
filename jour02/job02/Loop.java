package jour02.job02;

public class Loop {
    public static void main(String[] args) {
        int num = 100;
        while (num > 1) {
            System.out.print(num + ", ");
            if (num%10 == 1){
                System.out.print("\n");
            }
            num--;
        }
        System.out.println(num);
    }
}
