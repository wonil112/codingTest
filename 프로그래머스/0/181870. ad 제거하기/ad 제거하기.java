import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> listAnswer = new ArrayList<>();
        
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
               listAnswer.add(strArr[i]);
            }
        }
        
        String[] answer = new String[listAnswer.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = listAnswer.get(i);
        }
        
        return answer;
    }
}