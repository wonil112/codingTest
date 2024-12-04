class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++) {
            answer.append(String.valueOf(my_string.charAt(i)).repeat(Math.max(0, n)));
        }
        
        return answer.toString();
    }
}