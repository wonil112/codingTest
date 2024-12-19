class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++) {
            sb.append(my_string.charAt(i));
            if(is_prefix.equals(sb.toString())) {
                return 1;
            }
        }
        
        return 0;
    }
}