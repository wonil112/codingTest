import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);

        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
            } else {
                break;
            }
        }

        List<String> answer = new ArrayList<>();
        String[] blank = sb.toString().split(" ");
        for(int i = 0; i < blank.length; i++) {
            if(!blank[i].equals(" ") && !blank[i].isEmpty()){
                answer.add(blank[i]);
            }
        }

        String[] newAnswer = new String[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            newAnswer[i] = answer.get(i);
        }

        return newAnswer;
    }
}