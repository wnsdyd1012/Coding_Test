import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        String[] arr = myString.split("x");
        
        for (String str : arr){
            list.add(str.length());
        }
        
        if (myString.lastIndexOf("x") == myString.length()-1) list.add(0);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}