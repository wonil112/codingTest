class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            return numberOnly(s);
        } else {
            return false;
        }
    }

    public static boolean numberOnly(String str) {

        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}