package jour04.job08;

public class CustomThread extends Thread {
    public long sum;
    public int start;
    public int size;

    public CustomThread(int start, int size){
        this.sum = 0;
        this.start = start;
        this.size = size;
    }

    @Override
    public void run() {
        for (int i = start; i <= start+size; i++) {
            sum += i;
        }
    }

    public long getSum(){
        return sum;
    }
}
