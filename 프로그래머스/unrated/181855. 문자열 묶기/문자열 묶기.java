import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        
        ArrayList<Integer> lengthList = new ArrayList<>();
        
        for (String str : strArr){
            lengthList.add(str.length());
        }
        
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (int length : lengthList){
            countMap.put(length, countMap.getOrDefault(length, 0)+1);
        }
        
        return countMap.values().stream().max(Integer::compare).orElse(0);
    }
}