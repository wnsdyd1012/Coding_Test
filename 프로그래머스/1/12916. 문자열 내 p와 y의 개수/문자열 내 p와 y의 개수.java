class Solution {
    boolean solution(String s) {
        
        String str = s.toLowerCase();

        int p = 0;
        int y = 0;
        
        if (!str.contains("p") && !str.contains("y")) return true;
        
        for (int i=0; i<str.length(); i++){
            if (str.substring(i,i+1).equals("p")) p++;
            else if(str.substring(i,i+1).equals("y")) y++;
        }

        return p == y ? true : false;
    }
}