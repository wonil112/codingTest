import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        int[] sortNum = Arrays.stream(num_list).sorted().toArray();

        for(int i = 0; i < answer.length; i++) {
            answer[i] = sortNum[i + 5];
        }

        return answer;
    }
}