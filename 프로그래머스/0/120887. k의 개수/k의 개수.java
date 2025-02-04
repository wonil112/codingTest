class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String stringAnswer = "";

        for (int l = i; l <= j; l++) {
            String temp = stringAnswer + l;
            for (int m = 0; m < temp.length(); m++) {
                String tempString = "" + temp.charAt(m);
                if (Integer.parseInt(tempString) == k) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}