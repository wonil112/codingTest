import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];

        num_list = Arrays.stream(num_list).sorted().toArray();
        for (int i = 0; i < 5; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}