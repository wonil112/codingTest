class Solution {
    public int solution(int num1, int num2) {
        double number = (double)num1 / num2;
        double floor = Math.floor(number * 1000);
        return (int) floor;
    }
}