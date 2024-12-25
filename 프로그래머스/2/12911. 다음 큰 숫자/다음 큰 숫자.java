class Solution {
    public int solution(int n) {

        int countBinary = count(n);
        int answer = 0;

        for (int i = n + 1; i <= 1000000; i++) {
            if (count(i) == countBinary) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int count (int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;

        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
}