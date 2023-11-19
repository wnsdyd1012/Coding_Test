class Solution {
    public String solution(String str1, String str2) {
        String answer;
        char[] arr = new char[str1.length()*2];

        for(int i=0; i<str1.length(); i++){
            arr[2*i] = str1.charAt(i);
            arr[2*i+1] = str2.charAt(i);
        }
        answer = String.valueOf(arr);

        return answer;
    }
}