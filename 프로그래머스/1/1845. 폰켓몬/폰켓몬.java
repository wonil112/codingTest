import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
    
        int answer = (nums.length / 2);
        
        int[] distinctArray = Arrays.stream(nums).distinct().toArray();
        
        if(answer >= distinctArray.length) {
            return distinctArray.length;
        } else {
            return answer; 
        }
    }
}