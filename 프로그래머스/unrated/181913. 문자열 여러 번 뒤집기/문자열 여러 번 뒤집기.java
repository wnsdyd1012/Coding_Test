

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder str = new StringBuilder(my_string);

        for (int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];

            StringBuilder sub = new StringBuilder(str.substring(start, end + 1));
            sub.reverse();

            str.replace(start, end + 1, sub.toString());
        }

        return str.toString();
    }
}