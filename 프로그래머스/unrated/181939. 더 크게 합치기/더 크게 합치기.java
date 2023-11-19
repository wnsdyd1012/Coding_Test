class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String result1 = strA+strB;
        String result2 = strB+strA;
        
        int intResult1 = Integer.parseInt(result1);
        int intResult2 = Integer.parseInt(result2);
        
        answer = (intResult1>=intResult2) ? intResult1 : intResult2;
            
        return answer;
    }
}