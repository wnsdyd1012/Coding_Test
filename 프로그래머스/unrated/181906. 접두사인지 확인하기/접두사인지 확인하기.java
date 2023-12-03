import java.util.ArrayList;

class Solution {
    public static int solution(String my_string, String is_prefix) {
        
        ArrayList<String> arrList = new ArrayList<>();
        
        for (int i=0; i<my_string.length(); i++){
            arrList.add(my_string.substring(0,i+1));
        }
        
        boolean isContained = arrList.contains(is_prefix);
        
        return isContained ? 1 : 0;
    }
}