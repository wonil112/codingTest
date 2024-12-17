class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        big(wallet);
        big(bill);

        while (wallet[0] < bill[0] || wallet[1] < bill[1]){
            fold(bill);
            answer++;
        }

        return answer;
    }

    public void fold(int[] bill) {

        bill[0] = (int) bill[0] / 2;
        big(bill);
    }

    public void big(int[] number) {

        if(number[0] < number[1]) {
            int big = number[1];
            int small = number[0];
            number[0] = big;
            number[1] = small;
        }
    }
}