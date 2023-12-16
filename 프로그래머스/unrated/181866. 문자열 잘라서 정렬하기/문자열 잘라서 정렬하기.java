import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        
        String[] arr = myString.split("x");
        Arrays.sort(arr);
        
        ArrayList<String> list = new ArrayList<>();
        
        for (String str : arr){
            if (str.length() != 0) list.add(str);
        }
        
        return list.toArray(new String[0]);
    }
}