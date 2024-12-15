import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> stringList = new ArrayList<>();

        for(int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) {
                stringList.add(todo_list[i]);
            }
        }
        
        String[] answer = new String[stringList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = stringList.get(i);
        }

        return answer;
    }
}