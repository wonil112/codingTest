class Solution {
    public String solution(String my_string) {
        StringBuilder answerBuilder = new StringBuilder();
        answerBuilder.append(my_string.charAt(0));

        for(int i = 0; i < my_string.length(); i++) {
                int count = 0;
                for (int j = 0; j < answerBuilder.length(); j++) {
                    if(my_string.charAt(i) == answerBuilder.charAt(j)) {
                        break;
                    } else {
                        count++;
                    }
                }
                if(count == answerBuilder.length()) {
                    answerBuilder.append(my_string.charAt(i));
                }
        }

        return answerBuilder.toString();
    }
}