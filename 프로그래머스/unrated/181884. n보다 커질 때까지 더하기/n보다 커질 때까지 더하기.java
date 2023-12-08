class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        int index = 0;        
        while(true){
            sum += numbers[index];
            index++;
            if (sum>n) break;
        }
        return sum;
    }
}