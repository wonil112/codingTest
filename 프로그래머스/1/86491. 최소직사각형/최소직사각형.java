class Solution {
    public int solution(int[][] sizes) {
        
        // 변수 largeNumber 과 smallNumber 선언. 초기값은 sizes[0][0], sizes[0][1];
        int largeNumber = 0;
        int smallNumber = 0;
        
        if(sizes[0][0] >= sizes[0][1]) {
            largeNumber = sizes[0][0];
            smallNumber = sizes[0][1];
        } else {
            largeNumber = sizes[0][1];
            smallNumber = sizes[0][0];
        }
        
        // 배열 sizes 를 순회하면서 크기가 큰 숫자를 largeNumber / 작은 숫자를 smallNumber 과 비교
        // sizes 의 숫자가 더 크면 largeNumber 과 smallNumber update.
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] >= sizes[i][1]) {
                if(sizes[i][0] > largeNumber) {
                    largeNumber = sizes[i][0];
                }
                
                if(sizes[i][1] > smallNumber) {
                    smallNumber = sizes[i][1];
                }
            } else {
                if(sizes[i][1] > largeNumber) {
                    largeNumber = sizes[i][1];
                }
                
                if(sizes[i][0] > smallNumber) {
                    smallNumber = sizes[i][0];
                }
            }
        }
        return largeNumber * smallNumber;
    }
}