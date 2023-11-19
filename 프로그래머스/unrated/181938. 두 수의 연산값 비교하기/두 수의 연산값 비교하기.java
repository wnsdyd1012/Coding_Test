class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String result = strA+strB;
        
        int intResult = Integer.parseInt(result);
        
        answer = intResult>=2*a*b ? intResult : 2*a*b;
        
        return answer;
    }
}