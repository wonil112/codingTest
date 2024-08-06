import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {

        // 1번 수포자 - 12345 반복 (5자리)
        // 2번 수포자 - 21232425 반복 (8자리)
        // 3번 수포자 - 3311224455 반복 (10자리)

        // 완전탐색. 재귀
        // num1 num2 num3 각각 메서드 생성 후 각 메서드에서 점수 받아온 뒤 최고 점수를 maxScore에 저장.
        // 점수가 maxScore랑 같은 애들 answer에 넣고 sort 후 출력.
        int num1Answer = num1(answers, 0, 0, 0);
        int num2Answer = num2(answers, 0, 0, 0);
        int num3Answer = num3(answers, 0, 0, 0);
       
        List<Integer> list = new ArrayList<>();
        
        if(num1Answer >= num2Answer && num1Answer >= num3Answer) {
            list.add(1);
        }
        if(num2Answer >= num1Answer && num2Answer >= num3Answer) {
            list.add(2);
        }
        if(num3Answer >= num1Answer && num3Answer >= num2Answer) {
            list.add(3);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }

    public int num1 (int[] answers, int index, int answer1, int tempIndex) {

        int[] number1 = {1, 2, 3, 4, 5};

        if (index > answers.length - 1) {
            return answer1;
        }

        if (answers[index] == number1[tempIndex]) {
            answer1++;
        }

        if(tempIndex == number1.length - 1) {
            tempIndex = -1;
        }

        return num1(answers, index + 1, answer1, tempIndex + 1);
    }

    public int num2 (int[] answers, int index, int answer2, int tempIndex) {

        int[] number2 = {2, 1, 2, 3, 2, 4, 2, 5};

        if (index > answers.length - 1) {
            return answer2;
        }

        if (answers[index] == number2[tempIndex]) {
            answer2++;
        }

        if(tempIndex == number2.length - 1) {
            tempIndex = -1;
        }

        return num2(answers, index + 1, answer2, tempIndex + 1);
    }

    public int num3 (int[] answers, int index, int answer3, int tempIndex) {

        int[] number3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        if (index > answers.length - 1) {
            return answer3;
        }

        if (answers[index] == number3[tempIndex]) {
            answer3++;
        }

        if(tempIndex == number3.length - 1) {
            tempIndex = -1;
        }

        return num3(answers, index + 1, answer3, tempIndex + 1);
    }
}