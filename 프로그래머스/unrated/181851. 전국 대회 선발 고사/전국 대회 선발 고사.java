import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0; i<rank.length; i++){
            if (attendance[i]) list.add(rank[i]);
        }
        
        Collections.sort(list);
        
        ArrayList<Integer> ranklist = new ArrayList<>();
        for (int n : rank){
            ranklist.add(n);
        }
        
        return 10000*ranklist.indexOf(list.get(0)) +
            100*ranklist.indexOf(list.get(1)) +
            ranklist.indexOf(list.get(2));
    }
}