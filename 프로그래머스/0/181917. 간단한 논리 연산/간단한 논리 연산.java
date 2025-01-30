class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {

        if(x1 || x2) {
            if(x3 || x4) {
                return true;
            } else {
                return false;
            }
        }
        
        return false;
    }
}