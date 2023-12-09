import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : arr){
            if (num>=50 && num%2==0) list.add(num/2);
            else if (num<50 && num%2!=0) list.add(num*2);
            else list.add(num);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}