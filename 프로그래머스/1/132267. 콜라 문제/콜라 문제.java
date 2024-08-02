class Solution {
    public int solution(int a, int b, int n) {
        
        int answer = 0;
        int newBottle = 0;
        
        // 재귀없이 일단 트라이
        while(n >= a) {
            newBottle = (n / a) * b;
            answer += newBottle;
            n = (n % a) + newBottle;
        }
        
        return answer;
    }
}