import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> divided = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                divided.add(i);
            }
        }
        
        int[] answer = new int[divided.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = divided.get(i);
        }
            
        return answer;
    }
}