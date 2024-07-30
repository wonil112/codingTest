import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        int[] array = {10, 12};
        char leftHand = '*';
        char rightHand = '#';

        for (int number : numbers) {

            char currentKey = Character.forDigit(number, 10);
            if (currentKey == '1' || currentKey == '4' || currentKey == '7') {
                stringBuilder.append("L");
                leftHand = currentKey;
            } else if (currentKey == '3' || currentKey == '6' || currentKey == '9') {
                stringBuilder.append("R");
                rightHand = currentKey;
            } else {
                int leftDistance = getDistance(leftHand, currentKey);
                int rightDistance = getDistance(rightHand, currentKey);
                
                if(leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) {
                    stringBuilder.append("L");
                    leftHand = currentKey;
                } else {
                    stringBuilder.append("R");
                    rightHand = currentKey;
                }
            }
        }
        
        answer = stringBuilder.toString();

        return answer;
    }

    public static final Map<Character, int[]> keyMap = new HashMap<>();
    static {
        keyMap.put('1', new int[]{1, 2, 3, 4});
        keyMap.put('2', new int[]{0, 1, 2, 3});
        keyMap.put('3', new int[]{1, 2, 3, 4});
        keyMap.put('4', new int[]{2, 1, 2, 3});
        keyMap.put('5', new int[]{1, 0, 1, 2});
        keyMap.put('6', new int[]{2, 1, 2, 3});
        keyMap.put('7', new int[]{3, 2, 1, 2});
        keyMap.put('8', new int[]{2, 1, 0, 1});
        keyMap.put('9', new int[]{3, 2, 1, 2});
        keyMap.put('0', new int[]{3, 2, 1, 0});
        keyMap.put('*', new int[]{4, 3, 2, 1});
        keyMap.put('#', new int[]{4, 3, 2, 1});
    }
    
    public static int getDistance(char from, char to) {
        int[] fromDistanceArray = keyMap.get(from);

        switch (to) {
            case '2': return fromDistanceArray[0];
            case '5': return fromDistanceArray[1];
            case '8': return fromDistanceArray[2];
            case '0': return fromDistanceArray[3];
            default: return -1;
        }
    }
}