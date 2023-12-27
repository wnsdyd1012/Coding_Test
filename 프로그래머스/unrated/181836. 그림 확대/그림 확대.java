import java.util.ArrayList;

class Solution {
    public String[] solution(String[] picture, int k) {

        ArrayList<String> list = new ArrayList<>();
        
        for (int i=0; i<picture.length; i++){
            String str = "";
            for (int j=0; j<picture[i].length(); j++){
                str += picture[i].substring(j,j+1).repeat(k);
            }
            for (int n=0; n<k; n++){
                list.add(str);
            }
        }
        
        return list.toArray(new String[0]);
    }
}