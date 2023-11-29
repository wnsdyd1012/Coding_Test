import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int length = queries.length;
        int[] answer = new int[length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = 1000000;
            List<Integer> list = new ArrayList<>();
            for (int j = s; j < e + 1; j++) {
                if (arr[j] > k) {
                    list.add(arr[j]);
                }
            }
            Collections.sort(list);
            answer[i] = list.isEmpty() ? -1 : list.get(0);
        }
        return answer;
    }
}