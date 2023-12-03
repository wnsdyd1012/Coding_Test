import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        
        int length = my_string.length();
        List<String> arrList = new ArrayList<>();

        for (int i=0; i<length; i++){
            arrList.add(my_string.substring(length-i-1, length));
        }

        String[] answer = arrList.toArray(String[]::new);
        Arrays.sort(answer);

        return answer;
    }
}