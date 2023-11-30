class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int length = queries.length;
        int[] answer = new int[length];
        
        for (int i=0; i<length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for (int j=s; j<e+1; j++){
                if(j%k==0) arr[j] += 1;
            }
        }
        answer = arr;
        
        return answer;
    }
}