import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 기존 배열을 역순정렬후, for문을 돌면서 주어진 m 번째마다 잘라서 가장 작은 수를 answer에 더함.
        // 기존 배열은 역순정렬이 되지않아 Integer타입의 배열 선언 후 새로운 배열에 기존 배열의 값 입력.
        int index = 1;
        Integer[] temp = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            temp[i] = score[i];
        }

        Arrays.sort(temp, Collections.reverseOrder());

        for (int i = 0; i < temp.length; i++) {
            if(m == index) {
                answer += (temp[i] * m);
                index = 0;
            }
            index++;
        }

        return answer;
    }
}