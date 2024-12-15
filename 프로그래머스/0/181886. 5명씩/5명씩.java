import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> stringList = new ArrayList<>();
        
        for(int i = 0; i < names.length; i++) {
            if(i % 5 == 0) {
                stringList.add(names[i]);
            }
        }
        
        String[] answer = new String[stringList.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = stringList.get(i);
        }
        
        return answer;
    }
}