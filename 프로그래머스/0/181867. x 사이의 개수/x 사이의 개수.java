class Solution {
    public int[] solution(String myString) {
        String[] stringLength = myString.split("x", -1);
        int[] answer = new int[stringLength.length];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = stringLength[i].length();
        }

        return answer;
    }
}