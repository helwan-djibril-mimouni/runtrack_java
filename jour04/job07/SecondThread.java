package jour04.job07;

import java.util.ArrayList;

public class SecondThread extends Thread {
    ArrayList<Integer> arr;
    public int sum;

    public SecondThread(ArrayList<Integer> arr){
        this.arr = arr;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = arr.size()/2; i < arr.size(); i++) {
            sum += arr.get(i);
        }
    }

    public int getSum(){
        return sum;
    }
}
