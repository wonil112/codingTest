import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        // map으로 해서 key값에는 name, value값에는 yearning를 넣음.
        // for - photo[i] containsKey로 있으면 value 더하기.
        Map<String, Integer> map = new HashMap<>();

        // for 순회하면서 key값에는 name, value값에는 yearning를 넣음.
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        // photo 배열을 돌면서 키와 일치하면 점수 더하기
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) {
                    answer[i] += map.get(photo[i][j]);
                } else {
                    answer[i] += 0;
                }
            }
        }
        return answer;
    }
}