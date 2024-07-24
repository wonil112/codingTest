import java.util.*;

class Solution {
    public static int[] solution(int N, int[] stages) {

        int[] answer = new int[N];

        Map<Integer, Double> integerMap = new HashMap<>();

        for (int i = 1; i <= N + 1; i++) {
            integerMap.put(i,0.0);
        }
        for (int i = 0; i < stages.length; i++) {
            integerMap.put(stages[i],integerMap.get(stages[i])+1);
        }
        
        if(integerMap.size() == N + 1) {
            integerMap.remove(N + 1);
        }
        int countUser = stages.length;

        for (int i = 1; i <= integerMap.size(); i++) {
            if (countUser == 0) {
                integerMap.put(i, 0.0);
            } else {
                double failureRate = integerMap.get(i) / countUser;
                countUser = (int) (countUser - integerMap.get(i));
                integerMap.put(i, failureRate);
            }
        }

        List<Integer> keysetList = new ArrayList<>(integerMap.keySet());
        keysetList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return integerMap.get(o2).compareTo(integerMap.get(o1));
            }
        });

        for (int i = 0; i < N; i++) {
            answer[i] = keysetList.get(i);
        }

        return answer;
    }
}