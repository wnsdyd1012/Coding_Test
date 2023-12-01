import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> arrList = new ArrayList<>();

        while(n != 1){
            int num = n;
            arrList.add(num);
            if(n%2 == 0) num = n/2;
            else num = n*3 + 1;

            n = num;
            if(n==1) arrList.add(n);
        }
        
        int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}