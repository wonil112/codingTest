class Solution {
    public int solution(int n) {
        String ternaryToString = Integer.toString(n, 3);
        StringBuilder stringBuilder = new StringBuilder(ternaryToString);
        String stringToNumber;

        stringToNumber = stringBuilder.reverse().toString();
        return Integer.parseInt(stringToNumber,3);
    }
}