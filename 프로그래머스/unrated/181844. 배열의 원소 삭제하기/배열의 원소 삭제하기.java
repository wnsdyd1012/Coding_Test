import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        ArrayList<Integer> list = Arrays.stream(delete_list)
            .boxed()
            .collect(Collectors.toCollection(ArrayList::new));
        
        int[] answer = Arrays.stream(arr)
            .filter(i -> !list.contains(i))
            .toArray();
        
        return answer;
    }
}