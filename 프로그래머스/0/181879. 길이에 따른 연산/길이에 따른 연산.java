class Solution {
    public int solution(int[] num_list) {
        int answer = 1;

        if(num_list.length <= 10) {
            for (int i : num_list) {
                answer = answer * i;
            }
        } else {
            for (int j : num_list) {
                answer += j;
            }
            answer -= 1;
        }

        return answer;
    }
}