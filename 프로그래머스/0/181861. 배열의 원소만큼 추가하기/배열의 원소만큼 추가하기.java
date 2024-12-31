import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        List<Integer> listAnswer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                listAnswer.add(arr[i]);
            }
        }
        
        int[] answer = new int[listAnswer.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = listAnswer.get(i);
        }
        
        return answer;
    }
}