class Solution {
    public String solution(String my_string, String letter) {

        char ch = letter.charAt(0);
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) != ch) {
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString() ;
    }
}