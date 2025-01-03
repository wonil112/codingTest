class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) < 108) {
                answer += "l";
            } else {
                answer += myString.charAt(i);
            }
        }
        
        return answer;
    }
}