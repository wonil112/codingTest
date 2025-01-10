class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length > arr2.length) {
            answer = 1;
        } else if(arr2.length > arr1.length) {
            answer = -1;
        } else {
            int arr1sum = 0;
            int arr2sum = 0;
            for(int i = 0; i < arr1.length; i++) {
                arr1sum += arr1[i];
                arr2sum += arr2[i];
            }
            if(arr1sum > arr2sum) {
                answer = 1;
            } else if(arr2sum > arr1sum) {
                answer = -1;
            }
        }
        
        return answer;
    }
}