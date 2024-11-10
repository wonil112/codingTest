class Solution {
    public int solution(int n) {
        // 6과 n의 최소공배수를 찾은 후, 최소공배수를 6으로 나눈 값을 출력.
        // n에다가 1부터 6까지의 수를 곱해보고 그 중에서 6으로 나누어 떨어지는 수가 나오면
        // 해당 수를 6으로 나눈 값을 출력하고 종료.
        
        int answer = 0;
        for(int i = 1; i <= 6; i++) {
            if((n * i) % 6 == 0) {
                answer = (n * i) / 6;
                break;
            }
        }
        return answer;
    }
}