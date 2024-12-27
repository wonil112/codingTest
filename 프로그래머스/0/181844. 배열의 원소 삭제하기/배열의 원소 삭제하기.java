import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> listAnswer = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    count++;
                    break;
                }
            }
            if(count == 0) {
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