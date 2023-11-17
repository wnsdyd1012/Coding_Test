import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int length = array.length;
        Arrays.sort(array);
        int answer = array[length/2];
        
        return answer;
    }
}