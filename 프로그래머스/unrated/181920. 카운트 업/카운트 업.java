class Solution {
    public int[] solution(int start_num, int end_num) {
        int length = end_num - start_num + 1;
        int[] answer = new int[length];
        
        int count = 0;
        
        for(int i=start_num; i<end_num+1; i++){
            answer[count] = i;
            count++;
        }
        
        return answer;
    }
}