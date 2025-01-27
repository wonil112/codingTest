import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> listAnswer = new ArrayList<>();

        for(int i = 0; i < flag.length; i++) {
            if(flag[i]) {
                for(int j = 0; j < arr[i] * 2; j++) {
                    listAnswer.add(arr[i]);
                }
            } else {
                for(int k = 0; k < arr[i]; k++) {
                    listAnswer.remove(listAnswer.size() - 1);
                }
            }
        }

        int[] answer = new int[listAnswer.size()];
        for (int i = 0; i < listAnswer.size(); i++) {
            answer[i] = listAnswer.get(i);
        }

        return answer;
    }
}