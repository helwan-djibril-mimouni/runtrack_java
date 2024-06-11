package jour02.job01;

public class Loop {
    public static void main(String[] args) {
        int num = 1;
        while (num < 100) {
            System.out.print(num + ", ");
            if (num%10 == 0){
                System.out.print("\n");
            }
            num++;
        }
        System.out.println(num);
    }
}
