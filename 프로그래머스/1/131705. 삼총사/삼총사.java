class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        // 총 13명의 인원, 무작위로 3명을 뽑아서 더했을 때 합이 0
        // 전체를 순회하되, 3명 단위로 순회해야함.
        // 3중 for문....
        // 개선사항 있는지 확인
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}