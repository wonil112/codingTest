class Solution {
    public int solution(int n) {
        int answer = 0;
        String convertToString = Integer.toString(n, 3);
        StringBuilder convertToInt = new StringBuilder();

        for (int i = convertToString.length() - 1; i >= 0; i--) {
            convertToInt.append(convertToString.charAt(i));
        }

        for (int i = 0; i < convertToInt.length(); i++) {
            answer += (int) Math.pow(3, convertToInt.length() - (i + 1)) * Character.getNumericValue(convertToInt.charAt(i));
        }
        return answer;
    }
}