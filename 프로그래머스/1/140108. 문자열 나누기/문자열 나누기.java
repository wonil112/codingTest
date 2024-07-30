class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder stringBuilder = new StringBuilder(s);
        char x = stringBuilder.charAt(0);
        String tempString = "";
        int countX = 1;
        int countY = 0;
        int i = 1;

        while (stringBuilder.length() > i) {
            if(stringBuilder.charAt(i) == x) {
                countX++;
            } else {
                countY++;
            }

            if(stringBuilder.length() > i + 1 && countX == countY) {
                tempString = stringBuilder.substring(i + 1);
                stringBuilder = new StringBuilder(tempString);
                x = stringBuilder.charAt(0);
                i = 0;
                answer++;
                countX = 1;
                countY = 0;
            }

            i++;
        }

        if(stringBuilder.length() != 0) {
            answer++;
        }

        return answer;
    }
}