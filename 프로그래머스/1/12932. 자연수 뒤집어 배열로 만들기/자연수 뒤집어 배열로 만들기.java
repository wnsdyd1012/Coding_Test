import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (n > 0){
            list.add((int)(n%10));
            n /= 10;
        }
                
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}