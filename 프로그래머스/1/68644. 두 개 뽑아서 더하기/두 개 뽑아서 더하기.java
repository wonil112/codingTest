import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                arrayList.add(numbers[i] + numbers[j]);
            }
        }

        Collections.sort(arrayList);
        List<Integer> distinctList = arrayList.stream().distinct().collect(Collectors.toList());
        distinctList.toArray();
        
        int[] answer = new int[distinctList.size()];

        for (int i = 0; i < distinctList.size(); i++) {
            answer[i] = distinctList.get(i);
        }

        return answer;
    }
}