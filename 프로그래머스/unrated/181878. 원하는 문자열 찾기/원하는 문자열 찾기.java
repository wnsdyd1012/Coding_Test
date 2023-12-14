class Solution {
    public int solution(String myString, String pat) {
        String myStr = myString.toLowerCase();
        String myPat = pat.toLowerCase();

        return myStr.contains(myPat) ? 1 : 0;
    }
}