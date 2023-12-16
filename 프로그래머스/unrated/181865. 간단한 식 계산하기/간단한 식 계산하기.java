class Solution {
    public int solution(String binomial) {
        
        String[] arr = binomial.split(" ");
        String op = arr[1];
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);

        switch (op){
            case "+":
                return (a+b);
            case "-":
                return (a-b);
            case "*":
                return (a*b);
        }
        
        return 0;
    }
}