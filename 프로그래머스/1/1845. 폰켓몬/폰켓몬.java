import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Arrays.sort(nums);
        
        int checkNum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (checkNum != nums[i]) {
                answer ++;
                checkNum = nums[i];
            }
            if(answer == (nums.length) / 2) return answer;
        }
        
        return answer;
    }
}