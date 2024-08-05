class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        // 1번 배열과 2번 배열에서 각각 차례로 꺼내서 비교.
        // 1번의 i번째 단어 혹은 2번의 i번째 단어가 goal의 i 번째 단어와 같아야함.
        // for 돌면서 if goal[i].equals(cards1[i]), else if 2, else false
        // for 안에서 card1 과 card2 가 각각 돌아야 하므로 안에서 인덱스 조절 필요
        int j = 0;
        int k = 0;
        
        for (int i = 0; i < goal.length; i++) {
            if (j < cards1.length && goal[i].equals(cards1[j])) {
                j++;
                continue;
            } else if (k < cards2.length && goal[i].equals(cards2[k])) {
                k++;
                continue;
            } else {
                return "No";
                }
            }
         return "Yes";
    }
}