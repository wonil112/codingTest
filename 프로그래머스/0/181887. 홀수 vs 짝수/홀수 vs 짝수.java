class Solution {
    public int solution(int[] num_list) {
        int oddArray = 0;
        int evenArray = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) {
                oddArray += num_list[i];
            } else {
                evenArray += num_list[i];
            }
        }
        
        return oddArray > evenArray ? oddArray : evenArray;
    }
}