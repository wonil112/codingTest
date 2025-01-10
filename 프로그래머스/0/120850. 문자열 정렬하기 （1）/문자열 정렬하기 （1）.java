import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {

        List<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) <= 57) {
                arrayList.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
            }
        }
        
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}