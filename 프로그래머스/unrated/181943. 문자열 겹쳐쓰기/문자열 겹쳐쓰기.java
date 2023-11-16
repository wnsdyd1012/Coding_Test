class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int a = my_string.length();
        int b = overwrite_string.length();
        
        String my = my_string.substring(0,s);
        String overwrite = my_string.substring(s+b,a);
        answer = my + overwrite_string + overwrite;
        return answer;
    }
}