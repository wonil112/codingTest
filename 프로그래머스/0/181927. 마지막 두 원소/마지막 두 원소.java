class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int last = num_list.length - 1;
        
        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        if(num_list[last] > num_list[last - 1]) {
            answer[last + 1] = num_list[last] - num_list[last - 1];
        } else {
            answer[last + 1] = num_list[last] * 2;
        }
        
        return answer;
    }
}