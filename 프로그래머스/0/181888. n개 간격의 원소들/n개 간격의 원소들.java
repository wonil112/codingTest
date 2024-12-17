import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < num_list.length; i++) {
            if(i % n == 0) {
            answer.add(num_list[i]);
            }
        }
        
        int[] sol = new int[answer.size()];
        
        for(int i = 0; i < answer.size(); i++) {
            sol[i] = answer.get(i);
        }
        
        return sol;
    }
}