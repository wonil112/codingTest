import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> listAnswer = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(i % k == 0) {
                listAnswer.add(i);
            }
        }
        
        int[] answer = new int[listAnswer.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = listAnswer.get(i);
        }
        
        return answer;
    }
}