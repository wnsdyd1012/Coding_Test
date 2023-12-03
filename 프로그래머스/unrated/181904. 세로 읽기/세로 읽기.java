class Solution {
    public String solution(String my_string, int m, int c) {

        int row = my_string.length()%m==0 ?
                my_string.length()/m :
                my_string.length()/m + 1;

        char[][] arr = new char[row][m];
        int count = 0;
        char[] my_stringArr = my_string.toCharArray();

        for (int i=0; i<row; i++){
            for (int j=0; j<m; j++){
                arr[i][j] = my_stringArr[count];
                count++;
                if(count > my_string.length()) break;
            }
            if(count > my_string.length()) break;
        }

        String answer = "";
        for (int i=0; i<row; i++){
            answer += arr[i][c-1];
        }

        return answer;
    }
}