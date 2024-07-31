import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] charArray = s.toCharArray();
        
        Arrays.fill(answer, -1);
        
        for (int i = 1; i < charArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if(charArray[i] == charArray[j]) {
                    answer[i] = i - j;
                }
            }  
        }
        
        return answer;
    }
}