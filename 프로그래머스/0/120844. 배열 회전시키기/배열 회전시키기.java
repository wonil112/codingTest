class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if(direction.equals("right")) {
            int temp = numbers[numbers.length - 1];
            for(int i = 0; i < numbers.length - 1; i++) {
                answer[numbers.length - i - 1] = numbers[numbers.length - i - 2];
            }
            answer[0] = temp;
        } else {
            int temp = numbers[0];
            for(int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[numbers.length - 1] = temp;
        }

        return answer;
    }
}