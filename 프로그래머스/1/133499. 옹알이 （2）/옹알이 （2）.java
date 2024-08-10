class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        // 변수에 네가지 다 기록하고 babbling를 차례로 순회
        // 각 배열의 인덱스 값에 있는 것을 가져와서 앞에서부터 2글자 확인 후
        // ye 혹은 ma 라면 뒤 인덱스 확인
        // ay 혹은 wo 라면 뒤 인덱스 a / o 인지 확인 후 뒤 인덱스 확인

        for (int i = 0; i < babbling.length; i++) {
            if (!babbling[i].contains("ayaaya") && babbling[i].contains("aya")) {
                babbling[i] = babbling[i].replace("aya", " ");
            }
            if (!babbling[i].contains("yeye") && babbling[i].contains("ye")) {
                babbling[i] = babbling[i].replace("ye", " ");
            }
            if (!babbling[i].contains("woowoo") && babbling[i].contains("woo")) {
                babbling[i] = babbling[i].replace("woo", " ");
            }
            if (!babbling[i].contains("mama") && babbling[i].contains("ma")) {
                babbling[i] = babbling[i].replace("ma", " ");
            }

            if (babbling[i].trim().isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}