import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {
            int moveNumber = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                if(board[j][moveNumber] != 0) {
                    if(!stack.isEmpty() && stack.peek() == board[j][moveNumber]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][moveNumber]);
                    }
                    board[j][moveNumber] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}