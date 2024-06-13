package jour04.job05;

public class FirstThread extends Thread {
    public int max;
    public boolean end;

    public FirstThread(int i){
        this.max = i;
    }

    @Override
    public void run() {
        for (int i = 1; i <= max/2; i++) {
            System.out.println(i);
        }
    }
}
