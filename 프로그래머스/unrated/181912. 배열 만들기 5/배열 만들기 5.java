import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        List<Integer> arrList = new ArrayList<>();
        
        for (int i=0; i<intStrs.length; i++){
            int num = Integer.parseInt(intStrs[i].substring(s, s+l));
            if (num > k) arrList.add(num);
        }
        
        int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}