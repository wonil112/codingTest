class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            if(Math.pow(i, 2) == n) {
                return 1;
            } else if(Math.pow(i, 2) > n) {
                return 2;
            }
        }
        return 2;
    }
}