class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 2부터 n까지 순회하면서 소수 여부 확인. 소수라면 1 더해서 반환.
        // 효율성 시간초과.
        // 순회를 최소한으로 줄여보자.
        for (int i = 2; i <= n; i++) {
            if(i > 2 && i % 2 == 0) {
                continue;
            } else if(i > 3 && i % 3 == 0) {
                continue;
            } else if(i > 5 && i % 5 == 0) {
                continue;
            } else if(i > 7 && i % 7 == 0) {
                continue;
            } else if(isPrime(i)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    // 소수여부 판별 메서드
    // 자기자신의 제곱근까지만 순회.
    public boolean isPrime(int number) {
        int count = 0;
        for(int i = 1; i <= (int) Math.sqrt(number); i++) {
            if(number % i == 0) {
                count++;
            }
        }
        if(count == 1) {
            return true;
        } else {
            return false;
        }
    }
}