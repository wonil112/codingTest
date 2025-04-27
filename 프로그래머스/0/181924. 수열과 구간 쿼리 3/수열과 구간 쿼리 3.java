class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int a = 0;
        int b = 0;
        int temp = 0;
        
        for(int i = 0; i < queries.length; i++) {
            a = queries[i][0];
            b = queries[i][1];
            temp = arr[b];
            
            arr[b] = arr[a];
            arr[a] = temp;
        }
        
        return arr;
    }
}