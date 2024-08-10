class Solution {

    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++) {
            if(babbling[i].contains("aya")) {
                babbling[i] = babbling[i].replace("aya", " ");
            }
            if(babbling[i].contains("ye")) {
                babbling[i] = babbling[i].replace("ye", " ");
            }
            if(babbling[i].contains("woo")) {
                babbling[i] = babbling[i].replace("woo", " ");
            }
            if(babbling[i].contains("ma")) {
                babbling[i] = babbling[i].replace("ma", " ");
            }
            if(babbling[i].trim().isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}