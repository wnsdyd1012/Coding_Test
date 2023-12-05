import java.util.ArrayList;

class Solution {
    public int[] solution(int start, int end_num) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for (int i=start; i>end_num-1; i--){
            arrList.add(i);
        }
        
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}