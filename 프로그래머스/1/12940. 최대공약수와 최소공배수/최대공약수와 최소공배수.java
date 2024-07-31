import java.util.Stack;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        // 변수 2개 선언
        int greatestCommonDivisor = 0;
        int lowestCommonMultiple = 0;

        // 유클리드 호제법을 위한 stack 선언
        Stack<Integer> stack = new Stack<>();

        // 1. 최대공약수
        // 유클리드 호제법
        // n, m을 크기에 따라 stack에 넣고 큰 수로 작은 수를 나눈 나머지를 stack에 넣음.
        // stack의 마지막 입력값이 0이 된다면 (나누어 떨어진다면)
        // 그 마지막 나누기 직전의 값이 최대공약수

        if(n >= m) {
            stack.push(n);
            stack.push(m);
        } else {
            stack.push(m);
            stack.push(n);
        }
        int i = 1;
        while (stack.peek() != 0) {
            stack.push(stack.get(i - 1) % stack.get(i));
            i++;
        }
        stack.pop();
        greatestCommonDivisor = stack.peek();

        // 2. 최소공배수
        // 두 수를 곱해서 최대공약수로 나눔
        
        lowestCommonMultiple = (n * m) / greatestCommonDivisor;
        answer[0] = greatestCommonDivisor;
        answer[1] = lowestCommonMultiple;
        return answer;
    }
}