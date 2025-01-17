class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        
        int[] answer = new int[(b1 - a1) + (b2 - a2) + 2];
        int arr1 = b1 - a1 + 1;
        for(int i = 0; i < arr1; i++) {
            answer[i] = arr[i + a1];
        }
        
        int arr2 = b2 - a2 + 1;
        for(int i = arr1; i < arr2 + arr1; i++) {
            answer[i] = arr[i + a2 - arr1];
        }
        
        return answer;
    }
}