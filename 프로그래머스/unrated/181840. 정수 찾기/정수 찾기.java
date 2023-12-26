import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] num_list, int n) {
        
        return Arrays.stream(num_list)
            .boxed()
            .collect(Collectors.toCollection(ArrayList::new))
            .contains(n) ? 1 : 0;
    }
}