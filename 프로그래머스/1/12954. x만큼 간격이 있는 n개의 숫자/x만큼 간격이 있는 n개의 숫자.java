import java.util.ArrayList;

class Solution {
    public long[] solution(int x, int n) {
        
        ArrayList<Long> list = new ArrayList<>();
        
        for (int i=0; i<n; i++){
            list.add((long)(i+1)*x);
        }
        
        return list.stream().mapToLong(Long::longValue).toArray();
    }
}