class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        sb.append(myString);
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'A') {
                answer.append('A');
            } else {
                answer.append(String.valueOf(sb.charAt(i)).toLowerCase());
            }
        }

        return answer.toString();
    }
}