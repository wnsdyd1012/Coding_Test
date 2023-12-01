import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();

        int i = 0;
        while(i < arr.length){
            if (stkList.isEmpty()){
                stkList.add(arr[i]);
                i++;
            } else {
                if (stkList.get(stkList.size()-1) < arr[i]) {
                    stkList.add(arr[i]);
                    i++;
                } else {
                    stkList.remove(stkList.get(stkList.size()-1));
                }
            }
        }

        int[] stk = stkList.stream().mapToInt(Integer::intValue).toArray();

        return stk;
    }
}