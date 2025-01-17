import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        List<String> stringList = new ArrayList<>();
        String temp = "";
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'x' && !temp.isEmpty()) {
                stringList.add(temp);
                temp = "";
            } else if(myString.charAt(i) == 'x' && temp.isEmpty()) {
                continue;
            } else {
                temp += myString.charAt(i);
            }
        }
        
        if(!temp.isEmpty()) {
            stringList.add(temp);
        }
        
        String[] answer = new String[stringList.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = stringList.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}