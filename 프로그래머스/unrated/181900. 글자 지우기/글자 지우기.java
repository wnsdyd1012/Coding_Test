class Solution {
    public String solution(String my_string, int[] indices) {
        
        StringBuilder sb = new StringBuilder(my_string);

        for (int index : indices) {
            sb.deleteCharAt(index);
            sb.insert(index, " ");
        }

        return sb.toString().replace(" ", "");
    }
}