class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int highRank = 7;
        int lowRank = 7;

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    lowRank--;
                    highRank--;
                    break;
                } else if(lottos[i] == 0) {
                    highRank--;
                    break;
                }
            }
        }
        if(lowRank == 7) {
            lowRank = 6;
        }
        if(highRank == 7) {
            highRank = 6;
        }
        
        answer[0] = highRank;
        answer[1] = lowRank;

        return answer;
    }
}