import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String s) {

        // 문자열을 만들어야 하므로 문자열을 다루기 위한 StringBuilder 선언
        // 초기 입력받은 문자열과 출력하는 문자열의 길이를 확인하기 위한 StringBuilder 선언
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder(s);

        // 공백으로 구분되어있는 문자열이므로 split 을 이용해서 문자열 쪼개서 배열로 저장
        String[] splitString = s.split(" ");

        // 문자열 뒤쪽(맨 마지막)공백이 다 사라짐.

        // 공백으로 구분한 단어들을 각각 순회하면서 배열안의 요소들을 각각 char 타입으로 배열로 새로 저장.
        // 자른 char array 를 순회하면서 짝수번째 대문자, 홀수번째 소문자로 변환 후 StringBuilder 에 저장.
        // 단어 뒤에 공백 추가해서 저장.
        for (int i = 0; i < splitString.length; i++) {

            char[] charArray = splitString[i].toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                if (j % 2 == 0) {
                    charArray[j] = Character.toUpperCase(charArray[j]);
                } else {
                    charArray[j] = Character.toLowerCase(charArray[j]);
                }
            }

            stringBuilder.append(charArray);
            stringBuilder.append(" ");
        }

        // 맨 마지막 공백 삭제 후 반환.
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        if(stringBuilder.length() != stringBuilder1.length()) {
            stringBuilder.append(" ".repeat(stringBuilder1.length() - stringBuilder.length()));
        }
        
        return stringBuilder.toString();
    }
}