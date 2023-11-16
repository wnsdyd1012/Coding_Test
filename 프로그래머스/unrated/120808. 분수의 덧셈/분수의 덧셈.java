class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int num1 = numer1*denom2;
        int num2 = numer2*denom1;
        int newNumer = num1 + num2;
        int newDenom = denom1*denom2;
        int common = 0;
        int size = newNumer<newDenom ? newNumer : newDenom;
        for(int i=1; i<size+1; i++){
            if ((newNumer%i==0) && (newDenom%i==0)){
                if(i>common){
                    common = i;
                }
            } 
        }
        answer[0] = newNumer/common;
        answer[1] = newDenom/common;
        
        return answer;
    }
}