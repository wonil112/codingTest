class Solution {
    public int[] solution(int[] array) {
        int[] answer = {0, 0};
        int maxNumber = 0;
        int idx = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] > maxNumber) {
                maxNumber = array[i];
                idx = i;
            }
        }
        answer[0] = maxNumber;
        answer[1] = idx;

        return answer;
    }
}