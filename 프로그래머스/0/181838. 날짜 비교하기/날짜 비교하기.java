class Solution {
    public int solution(int[] date1, int[] date2) {
        String first = "";
        String second = "";
        
        for(int i = 0; i < date1.length; i++) {
            first += date1[i];
            second += date2[i];
        }
        
        return Integer.parseInt(first) < Integer.parseInt(second) ? 1 : 0;
    }
        
}