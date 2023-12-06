class Solution {
    public int solution(int[] arr, int idx) {

        int answer = 0;

        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == 1 && i>=idx){
                if (i<min) {
                    min = i;
                    answer = min;
                    break;
                }
            } else {
                answer = -1;
            }
        }

        return answer;
    }
}