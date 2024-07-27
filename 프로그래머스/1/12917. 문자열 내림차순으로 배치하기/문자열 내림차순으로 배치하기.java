import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = s.toCharArray();
        
        Arrays.sort(charArray);
        
        for (int i = 0; i < charArray.length; i++) {
            stringBuilder.append(charArray[i]);
        }
        
        return stringBuilder.reverse().toString();
    }
}