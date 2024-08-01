import java.util.*;

class Solution {
    public int solution(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        // 리스트가 더 나을듯 리스트 ㄱ
        List<Character> transform = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            transform.add(s.charAt(i));
        }

        // 리스트 돌면서 숫자면 스트링빌더에 저장 아니라면 영어 확인
        for (int i = 0; i < transform.size(); i++) {
            if(Character.isDigit(transform.get(i))){
                stringBuilder.append(transform.get(i));
            } else {
                temp.append(transform.get(i));
                if(temp.length() == 2) {
                    String str = temp.toString();
                    if(str.equals("ze")) {
                        stringBuilder.append(0);
                        i += 2;
                    } else if (str.equals("on")) {
                        stringBuilder.append(1);
                        i++;
                    } else if (str.equals("tw")) {
                        stringBuilder.append(2);
                        i++;
                    } else if (str.equals("th")) {
                        stringBuilder.append(3);
                        i += 3;
                    } else if (str.equals("fo")) {
                        stringBuilder.append(4);
                        i += 2;
                    } else if (str.equals("fi")) {
                        stringBuilder.append(5);
                        i += 2;
                    } else if (str.equals("si")) {
                        stringBuilder.append(6);
                        i++;
                    } else if (str.equals("se")) {
                        stringBuilder.append(7);
                        i += 3;
                    } else if (str.equals("ei")) {
                        stringBuilder.append(8);
                        i += 3;
                    } else if (str.equals("ni")){
                        stringBuilder.append(9);
                        i += 2;
                    }
                    temp.delete(0, 1);
                }
            }
        }

        return Integer.parseInt(stringBuilder.toString());
    }
}