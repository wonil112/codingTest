class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long cost = 0;
        int i = 1;
        
        while(i <= count) {
            cost += price * i;
            i++;
        }
        
        if(cost <= money) {
            return 0;
        } else {
            return cost - money;
        }
    }
}