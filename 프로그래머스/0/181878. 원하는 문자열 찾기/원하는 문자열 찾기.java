class Solution {
    public int solution(String myString, String pat) {
        String myStringLower = myString.toLowerCase();
        String patLower = pat.toLowerCase();
        return myStringLower.contains(patLower) ? 1 : 0;
    }
}