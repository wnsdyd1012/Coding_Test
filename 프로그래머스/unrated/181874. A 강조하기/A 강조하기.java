class Solution {
    public String solution(String myString) {
        
        String str = myString.toLowerCase();
        char[] arr = str.toCharArray();
        
        for(int i=0; i<arr.length; i++){
            if (arr[i] == 'a') arr[i] = 'A';
        }
        
        return String.valueOf(arr);
    }
}