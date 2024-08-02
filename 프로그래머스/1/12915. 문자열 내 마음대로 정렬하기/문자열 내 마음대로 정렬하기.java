import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> stringList = new ArrayList<>();

        // strings에서 각 n번째 문자를 뽑아서 새로운 배열로 만들고
        char[] charArray = new char[strings.length];
        
        // 기존 받아온 배열도 정렬
        Arrays.sort(strings);

        // 순회하면서 문자열 뽑고 리스트에도 추가
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = strings[i].charAt(n);
            stringList.add(strings[i]);
        }

        // 새로 만든 배열을 정렬.
        Arrays.sort(charArray);
        
        // 새로 만든 문자들의 정렬의 요소를 순회하면서
        // 정렬한 기존 배열에서 해당 위치의 요소가 일치하면 다시 배열에 담아서 반환
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if(charArray[i] == stringList.get(j).charAt(n)) {
                    answer[i] = stringList.get(j);
                    stringList.remove(j);
                    break;
                }
            }
        }

        return answer;
    }
}