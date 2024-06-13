package jour04.job05;

public class SecondThread extends Thread {
    public int max;
    public FirstThread ft;

    public SecondThread(int i, FirstThread ft){
        this.max = i;
        this.ft = ft;
    }

    @Override
    public void run() {
        try {
            ft.join();
            for (int i = max/2+1; i <= max; i++) {
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
