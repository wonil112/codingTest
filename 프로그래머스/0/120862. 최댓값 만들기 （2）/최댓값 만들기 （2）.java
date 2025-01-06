import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int[] sortedArray = Arrays.stream(numbers).sorted().toArray();
        int first = sortedArray[0] * sortedArray[1];
        int last = sortedArray[sortedArray.length - 1] * sortedArray[sortedArray.length - 2];

        return Math.max(first, last);
    }
}