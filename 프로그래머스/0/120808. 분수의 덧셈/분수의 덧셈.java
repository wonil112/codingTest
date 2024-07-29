class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int commonNumer = (numer1 * denom2) + (numer2 * denom1);
        int commonDenom = denom1 * denom2;
        int lowerNumber = 0;

        if(commonNumer > commonDenom) {
            lowerNumber = commonDenom;
        } else if(commonNumer < commonDenom){
            lowerNumber = commonNumer;
        } else {
            answer[0] = 1;
            answer[1] = 1;
            return answer;
        }

        for(int i = lowerNumber; i > 1; i--) {
            if(commonNumer % i == 0 && commonDenom % i == 0) {
                commonNumer /= i;
                commonDenom /= i;
            }
        }
        answer[0] = commonNumer;
        answer[1] = commonDenom;
        return answer;
    }
}