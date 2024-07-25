class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int row = 0;
        int colum = -1;
        int direction = 1;
        int currentNum = 1;

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                colum += direction;
                answer[row][colum] = currentNum;
                currentNum++;
            }
            
            n--;
            
            for (int j = 0; j < n; j++) {
                row += direction;
                answer[row][colum] = currentNum;
                currentNum++;
            }
            
            direction = direction * (-1);
        }
        
        return answer;
    }
}