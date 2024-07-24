import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] stringArr1 = new String[n];
        String[] stringArr2 = new String[n];
        String[] answerArr = new String[n];
        long[] longArr1 = new long[n];
        long[] longArr2 = new long[n];
        long sumNum = 0;

        for (int i = 0; i < n; i++) {
            stringArr1[i] = Integer.toBinaryString(arr1[i]);
            stringArr2[i] = Integer.toBinaryString(arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            longArr1[i] = Long.parseLong(stringArr1[i]);
            longArr2[i] = Long.parseLong(stringArr2[i]);
            sumNum = longArr1[i] + longArr2[i];
            answerArr[i] = "" + sumNum;

            if (answerArr[i].length() < n) {
                answerArr[i] = "0".repeat(n - answerArr[i].length()) + answerArr[i];
            }
        }

        Arrays.fill(answer, "");

        for (int i = 0; i < answerArr.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (Character.getNumericValue(answerArr[i].charAt(j)) == 0) {
                    answer[i] += " ";
                } else {
                    answer[i] += "#";
                }
            }
        }
        return answer;
    }
}