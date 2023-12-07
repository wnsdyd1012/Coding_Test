import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {

        IntStream stream1 = Arrays.stream(num_list, n, num_list.length);
        IntStream stream2 = Arrays.stream(num_list, 0, n);
        
        return IntStream.concat(stream1, stream2).toArray();
    }
}