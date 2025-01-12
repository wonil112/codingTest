class Solution {
    public String solution(int age) {
        String answer = "";
        String ageString = Integer.toString(age);

        for(int i = 0; i < ageString.length(); i++) {
            answer += (char) (ageString.charAt(i) + 49);
        }
        return answer;
    }
}