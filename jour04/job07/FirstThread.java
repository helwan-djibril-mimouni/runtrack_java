package jour04.job07;

import java.util.ArrayList;

public class FirstThread extends Thread {
    ArrayList<Integer> arr;
    public int sum;

    public FirstThread(ArrayList<Integer> arr){
        this.arr = arr;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.size()/2; i++) {
            sum += arr.get(i);
        }
    }

    public int getSum(){
        return sum;
    }
}
