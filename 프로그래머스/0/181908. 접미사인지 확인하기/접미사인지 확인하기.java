class Solution {
    public int solution(String my_string, String is_suffix) {
        
        if(my_string.length() < is_suffix.length()) {
            return 0;
        }
        
        return my_string.substring(my_string.length() - is_suffix.length()).equals(is_suffix) ? 1 : 0;
    }
}