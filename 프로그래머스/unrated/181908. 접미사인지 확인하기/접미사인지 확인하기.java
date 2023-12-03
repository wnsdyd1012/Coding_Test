import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_suffix) {

        int length = my_string.length();
        ArrayList<String> arrList = new ArrayList<>();
        
        for (int i=0; i<length; i++){
            arrList.add(my_string.substring(length-i-1, length));
        }
        
        boolean isContained = arrList.contains(is_suffix);
        
        return isContained ? 1 : 0;
    }
}