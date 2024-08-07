import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // 3중 for문.
        // i j k 를 순회하면서 i번째 + j번째 + k번째 를 하여 리스트에 담기.
        // 리스트를 순회하면서 소수인지 확인.
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        
        for(int i = 0; i < list.size(); i++) {
            int tempNum = 0;
            for(int j = 1; j < list.get(i); j++) {
                if(list.get(i) % j == 0) {
                    tempNum++;
                }
            }
            if (tempNum == 1) {
                answer++;
            }
        }

        return answer;
    }
}