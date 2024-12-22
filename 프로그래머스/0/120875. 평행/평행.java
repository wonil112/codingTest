class Solution {
    public int solution(int[][] dots) {

        double incline01 = (double) (dots[0][0] - dots[1][0]) / (dots[0][1] - dots[1][1]);
        double incline23 = (double) (dots[2][0] - dots[3][0]) / (dots[2][1] - dots[3][1]);
        double incline02 = (double) (dots[0][0] - dots[2][0]) / (dots[0][1] - dots[2][1]);
        double incline13 = (double) (dots[1][0] - dots[3][0]) / (dots[1][1] - dots[3][1]);
        double incline03 = (double) (dots[0][0] - dots[3][0]) / (dots[0][1] - dots[3][1]);
        double incline12 = (double) (dots[1][0] - dots[2][0]) / (dots[1][1] - dots[2][1]);

        if (incline01 == incline23) {
            return 1;
        } else if (incline02 == incline13) {
            return 1;
        } else if (incline03 == incline12) {
            return 1;
        }
        return 0;
    }
}