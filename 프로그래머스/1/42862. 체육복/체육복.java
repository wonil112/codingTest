import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] cloth = new int[n];

        Arrays.fill(cloth, 1);

        for (int i = 0; i < reserve.length; i++) {
            cloth[reserve[i] - 1]++;
        }

        for (int i = 0; i < lost.length; i++) {
            cloth[lost[i] - 1]--;
        }

        if(cloth[0] == 2 && cloth[1] == 0) {
                cloth[0]--;
                cloth[1]++;
        }

        if(cloth[n-1] == 2 && cloth[n-2] == 0) {
                cloth[n-1]--;
                cloth[n-2]++;
        }

        for (int i = 1; i < cloth.length - 1; i++) {
            if(cloth[i] == 2) {
                if(cloth[i-1] == 0) {
                    cloth[i-1]++;
                    cloth[i]--;
                } else if(cloth[i+1] == 0) {
                    cloth[i+1]++;
                    cloth[i]--;
                }
            }
        }

        for (int i = 0; i < cloth.length; i++) {
            if(cloth[i] >= 1) {
                answer++;
            }
        }

        return answer;
    }
}