class Solution {
    public String solution(String s, int n) {

        // StringBuilder / charArray 선언 후 s 문자열 잘라서 넣기.
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = s.toCharArray();

        // 순회 ( 공백여부 / 공백이 아니면 유니코드로 대문자 소문자 판별 후 n 더하기. 만약 초과하면 -26
        for (int i = 0; i < charArray.length; i++) {

            if(charArray[i] != ' ') {
                int unicode = charArray[i];
                if(unicode >= 65 && unicode <= 90) {
                    unicode += n;
                    if(unicode > 90) {
                        unicode -= 26;
                    }
                } else {
                    unicode += n;
                    if(unicode > 122) {
                        unicode -= 26;
                    }
                }
                char c = (char) unicode;
                stringBuilder.append(c);
            } else {
                stringBuilder.append(' ');
            }
        }

       return stringBuilder.toString();
    }
}