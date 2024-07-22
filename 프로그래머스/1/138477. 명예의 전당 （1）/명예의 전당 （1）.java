import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] tempArray = new int[k];
        int[] answer = new int[score.length];

        Arrays.fill(tempArray, Integer.MAX_VALUE);

        for (int i = 0; i < score.length; i++) {
            if(i < k) {
                tempArray[i] = score[i];
            } else {
                if (score[i] > tempArray[0]) {
                    tempArray[0] = score[i];
                }
            }

            Arrays.sort(tempArray);

            answer[i] = tempArray[0];
        }

        return answer;
    }
}