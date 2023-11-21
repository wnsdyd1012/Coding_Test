class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        
        int length = num_list.length;
        int num1 = num_list[length-1] - num_list[length-2];
        int num2 = num_list[length-1]*2;
        
        for(int i=0; i<length; i++){
            answer[i] = num_list[i];
        }
        
        answer[length] = num1>0 ? num1 : num2;
        
        return answer;
    }
}