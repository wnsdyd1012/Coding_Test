import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {

        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++){
            if (flag[i]){
                for (int j=0; j<arr[i]*2; j++){
                    list.add(arr[i]);
                }
            } else {
                list.subList(list.size()-arr[i], list.size()).clear();
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}