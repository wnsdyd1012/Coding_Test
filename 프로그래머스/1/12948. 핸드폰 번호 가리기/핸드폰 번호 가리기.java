class Solution {
    public String solution(String phone_number) {
        String answer = "";
            String encrypt = "*";
            String num = phone_number.substring(phone_number.length()-4, phone_number.length());
            answer += encrypt.repeat(phone_number.length()-4);
            // for (int i = 0; i < phone_number.length()-4 ; i++)
            //     answer += "*";
            answer += num;
            System.out.println(answer);
            return answer;
    }
}