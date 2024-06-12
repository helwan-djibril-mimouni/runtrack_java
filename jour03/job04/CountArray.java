package jour03.job04;

import java.util.HashMap;
import java.util.Map;

public class CountArray {
    public static void main(String[] args) {
        int[] arr = {3, 7, 3, 9, 8};
        Map<Integer,Integer> hm = new HashMap();

        for(int x : arr){

            if(!hm.containsKey(x)){
                hm.put(x,1);
            }else{
                hm.put(x, hm.get(x)+1);
            }
        }
        System.out.println(hm);
    }
}
