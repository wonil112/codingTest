class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
        int sum = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            multiply *= num_list[i];
        }
        
        for(int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
        }
        
        return multiply < sum * sum ? 1 : 0;
    }
}