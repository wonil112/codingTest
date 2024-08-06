import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        // 약수의 개수를 담을 list 생성
        List<Integer> list = new ArrayList<>();
        // 1부터 number 까지 모든 수의 약수의 개수를 list에 저장
        for (int i = 1; i <= number; i++) {
            int divisor = 0;
            for(int j = 1; j <= (int) Math.sqrt(i); j++) {
                if(i % j == 0) {
                    if(Math.pow(j, 2) == i) {
                        divisor++;
                    } else {
                    divisor += 2;
                    }
                }
            }
            // list 안의 요소를 순회하면서 limit 보다 요소의 수치가 높으면
            // power를 answer에 더하기
            // limit 보다 낮으면 그대로 answer에 더하기
            if (divisor > limit) {
                answer += power;
            } else {
                answer += divisor;
            }
        }
        
        return answer;
    }
}