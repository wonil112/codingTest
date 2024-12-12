class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == alp.charAt(0)) {
                answer.append(alp.toUpperCase());
            } else {
                answer.append(sb.charAt(i));
            }
        }

        return answer.toString();
    }
}