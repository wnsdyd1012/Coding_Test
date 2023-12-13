class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mult = 1;
        
        for (int num : num_list){
            sum += num;
        }
        
        for (int num : num_list){
            mult *= num;
        }
        
        return num_list.length > 10 ? sum : mult;
    }
}