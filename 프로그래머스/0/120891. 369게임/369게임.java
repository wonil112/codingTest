class Solution {
    public int solution(int order) {
        int answer = 0;
        String count = "" + order;
        
        for(int i = 0; i < count.length(); i++) {
            if(count.charAt(i) == '3' || count.charAt(i) == '6' || count.charAt(i) == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}