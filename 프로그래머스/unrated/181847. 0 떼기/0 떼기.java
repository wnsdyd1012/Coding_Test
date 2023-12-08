class Solution {
    public String solution(String n_str) {
        
        if (n_str.charAt(0) != '0') return n_str;
        
        String answer = "";
        
        for (int i=0; i<n_str.length(); i++){
            if (n_str.charAt(i) != '0') break;
            answer = n_str.substring(i+1, n_str.length());
        }
        
        return answer;
    }
}