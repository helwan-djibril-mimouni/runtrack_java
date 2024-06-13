package jour04.job08;

import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int num = 1000000;
        ArrayList<CustomThread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threads.add(new CustomThread(i*(num/10), num/10));
            threads.get(i).run();
        }
        long sum = 0;
        for (CustomThread ct : threads) {
            try {
                ct.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (CustomThread ct : threads) {
            sum += ct.getSum();
        }
        System.out.println(sum);
        long stopTime = System.nanoTime();
        System.out.println("Total time : " + ((stopTime-startTime)/1000000) + "ms");
    }
}
