import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        // p의 길이를 변수로 생성
        int length = p.length();

        // t 잘라서 넣을 리스트 생성
        List<String> list = new ArrayList<>();

        // t를 p의 길이만큼씩 잘라서 리스트에 넣기
        for (int i = 0; i <= t.length() - p.length(); i++) {
            list.add(t.substring(i, i + p.length()));
        }

        // p를 숫자로 변환하기. 새로운 변수 선언 및 char[] 선언 후 넣고 getNumericValue
        long standardNumber = Long.parseLong(p);

        // 각 리스트의 요소와 p를 비교해서 p보다 작거나 같은 수를 만나면 answer++;
        for (int i = 0; i < list.size(); i++) {
            if(standardNumber >= Long.parseLong(list.get(i))) {
                answer++;
            }
        }

        // answer 반환
        return answer;
    }
}