import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String dartResult) {
        int i = 0;
        List<Integer> scores = new ArrayList<>();
        char powChar;
        int lastIndex = 0;

        while (i < dartResult.length()) {
            int score = 0;
            if(i + 1 < dartResult.length() && dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0') {
                score = 10;
                i += 2;
            } else {
                score = Character.getNumericValue(dartResult.charAt(i));
                i++;
            }

            if(i < dartResult.length()) {
                powChar = dartResult.charAt(i);
                score = powScore(score, powChar);
                i++;
            }

            if(i < dartResult.length() && (dartResult.charAt(i) == '*' || dartResult.charAt(i) == '#')) {
                if(dartResult.charAt(i) == '#') {
                    score *= -1;
                } else if (dartResult.charAt(i) == '*') {
                    if(!scores.isEmpty()) {
                        lastIndex = scores.size() - 1;
                        scores.set(lastIndex, scores.get(lastIndex) * 2);
                    }
                    score *= 2;
                }
                i++;
            }
            scores.add(score);
        }

        return scores.stream().mapToInt(Integer::intValue).sum();
    }

    public static int powScore(int score, char powChar) {
        return switch (powChar) {
            case 'D' -> (int) Math.pow(score, 2);
            case 'T' -> (int) Math.pow(score, 3);
            default -> score;
        };
    }
}