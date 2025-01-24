class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int count = 1;
        
        for(int i = 0; i < my_string.length(); i++) {
            
            if(count == c) {
                answer += my_string.charAt(i);
            }
            
            if(count == m) {
                count = 0;
            }
            
            count++;
        }
        
        return answer;
    }
}