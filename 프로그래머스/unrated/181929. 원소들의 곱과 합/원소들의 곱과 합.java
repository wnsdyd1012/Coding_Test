class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum1 = 1;
        int sum2 = 0;
        
        for(int i=0; i<num_list.length; i++){
            sum1 *= num_list[i];
        }
        
        for(int i=0; i<num_list.length; i++){
            sum2 += num_list[i];
        }
        
        answer = (sum1<sum2*sum2) ? 1 : 0;
        
        return answer;
    }
}