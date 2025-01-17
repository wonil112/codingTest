import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        int count = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(count >= indices.length) {
                answer += my_string.charAt(i);
            } else if(i == indices[count]) {
                count++;
            } else {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}