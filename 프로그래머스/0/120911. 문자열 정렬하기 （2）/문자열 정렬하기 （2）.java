import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String lower = my_string.toLowerCase();
        Character[] charLower = new Character[lower.length()];
        for(int i = 0; i < charLower.length; i++) {
            charLower[i] = lower.charAt(i);
        }
        Arrays.sort(charLower);

        for (int i = 0; i < charLower.length; i++) {
            answer += charLower[i];
        }
        
        return answer;
    }
}