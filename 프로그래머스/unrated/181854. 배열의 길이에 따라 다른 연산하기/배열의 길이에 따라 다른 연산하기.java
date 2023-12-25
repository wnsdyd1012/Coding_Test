class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        
        if (arr.length%2 == 0){
            for (int i=0; i<arr.length/2; i++){
                arr[2*i+1] += n;
            }
        } else {
            for (int i=0; i<arr.length/2 + 1; i++){
                arr[2*i] += n;
            }
        }
        
        return arr;
    }
}