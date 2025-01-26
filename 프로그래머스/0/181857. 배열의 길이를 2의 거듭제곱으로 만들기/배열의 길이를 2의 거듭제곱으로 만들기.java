class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1) {
            return arr;
        }
        
        
        int arrLength = 0;

        for(int i = 1; i < 11; i++) {
            if(arr.length > Math.pow(2, i - 1) && arr.length <= Math.pow(2, i)) {
                arrLength = (int) Math.pow(2, i);
            }
        }

        int[] answer = new int[arrLength];
        for(int i = 0; i < answer.length; i++) {
            if(i < arr.length) {
                answer[i] = arr[i];
            } else {
                answer[i] = 0;
            }
        }


        return answer;
    }
}