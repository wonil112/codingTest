class Solution {
    public int solution(String number) {
        int answer = 0;
         String temp = "";
        
        for(int i = 0; i < number.length(); i++) {
            answer += Integer.parseInt(temp + number.charAt(i));
        }
        
        return answer % 9;
    }
}