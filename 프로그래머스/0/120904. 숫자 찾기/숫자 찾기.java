class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String check = "" + num;
        
        for(int i = 0; i < check.length(); i++) {
            if(Character.getNumericValue(check.charAt(i)) == k) {
                return i + 1;
            }
        }
        
        return answer;
    }
}