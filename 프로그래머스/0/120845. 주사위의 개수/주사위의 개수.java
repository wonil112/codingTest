class Solution {
    public int solution(int[] box, int n) {
        int width = box[0] / n;
        int depth = box[1] / n;
        int height = box[2] / n;
        
        return width * depth * height;
    }
}