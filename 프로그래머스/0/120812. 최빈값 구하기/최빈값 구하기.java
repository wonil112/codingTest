import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = array[0];
        int count = 1;
        int maxCount = 1;
        
        Arrays.sort(array);
        int manyNum = array[0];
        int currentNum = array[0];
                
        for (int i = 1; i < array.length; i++) {
            if (array[i] == manyNum) {
                count++;
                maxCount++;
                answer = array[i];
            } else {
                if(array[i] == currentNum) {
                    count++;
                } else {
                    currentNum = array[i];
                    count = 1;
                }
                
                if(count == maxCount) {
                    answer = -1;
                } else if(count > maxCount) {
                    maxCount = count;
                    manyNum = array[i];
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}