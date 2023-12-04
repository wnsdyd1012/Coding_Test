import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for (int i=1; i<n+1; i++){
            if (i%k == 0) arrList.add(i);
        }
        
        int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}