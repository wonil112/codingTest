import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(String dartResult) {
        List<Integer> scores = new ArrayList<>();
        int length = dartResult.length();
        int i = 0;

        while (i < length) {
            int score;
            if (dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0') {
                score = 10;
                i += 2;
            } else {
                score = Character.getNumericValue(dartResult.charAt(i));
                i++;
            }

            char bonus = dartResult.charAt(i);
            i++;
            score = calculateBaseScore(score, bonus);

            if (i < length && (dartResult.charAt(i) == '*' || dartResult.charAt(i) == '#')) {
                char option = dartResult.charAt(i);
                i++;
                applyOption(scores, score, option);
            } else {
                scores.add(score);
            }
        }

        return scores.stream().mapToInt(Integer::intValue).sum();
    }

    private static int calculateBaseScore(int score, char bonus) {
        return switch (bonus) {
            case 'D' -> (int) Math.pow(score, 2);
            case 'T' -> (int) Math.pow(score, 3);
            default -> score;
        };
    }

    private static void applyOption(List<Integer> scores, int score, char option) {
        if (option == '*') {
            if (!scores.isEmpty()) {
                int lastIndex = scores.size() - 1;
                scores.set(lastIndex, scores.get(lastIndex) * 2);
            }
            scores.add(score * 2);
        } else if (option == '#') {
            scores.add(score * -1);
        } else {
            scores.add(score);
        }
    }
}
