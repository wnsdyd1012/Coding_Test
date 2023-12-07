import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int num : arr) {
            arrList.add(num);
        }
        if (arrList.contains(2)) {
            int start = arrList.indexOf(2);
            int end = arrList.lastIndexOf(2);

            return Arrays.stream(arr, start, end+1).toArray();
        } else {
            return new int[]{-1};
        }
    }
}