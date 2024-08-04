import java.sql.Array;

class Solution {
    public int[] solution(int n) {
        int k = 0;
        if(n % 2 == 0) {
            k = n / 2;
        } else {
            k = (n / 2) + 1;
        }

        int[] answer = new int[k];
        int i = 1;
        int j = 0;

        while( n >= i ) {
            if(i % 2 == 1) {
                answer[j] = i;
                j++;
                i++;
            } else {
                i++;
            }
        }
        return answer;
    }
}