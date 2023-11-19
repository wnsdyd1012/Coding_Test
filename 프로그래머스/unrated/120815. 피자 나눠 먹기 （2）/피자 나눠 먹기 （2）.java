class Solution {
    public int solution(int n) {
        int answer = 0;
        int size = n<6 ? n : 6;
        int max = 0;
        
        for(int i=1; i<=size; i++){
            if(n%i==0 && 6%i==0){
                if(i>max) max = i;
            }
        }
        
        answer = n/max;
        
        return answer;
    }
}