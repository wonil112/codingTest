class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        // 1~n까지가 번호.
        // 룰러의 길이는 m -> 한번에 m 미터 만큼 칠해짐.
        // 최소한의 페인트칠.
        
        // 오름차순 정렬이므로 첫번째 행 + m 을 할때 새로 만든 변수를 업데이트 (칠한 번호까지) 하고 answer++;
        // 만약 다음행이 새로 만든 변수보다 작으면 패스. 크면 다시 + m 하면서 칠하기 패턴
        // 단, 행 + m이 n보다 커지면 answer++ 하면서 종료.
        
        int painted = 0;
        for (int i = 0; i < section.length; i++) {
            if(section[i] + m - 1 >= n) {
                answer++;
                return answer;
            } else if(section[i] <= painted){
                continue;
            } else {
                painted = section[i] + m - 1;
                answer++;
            }
            
            if(painted >= section[section.length - 1]) {
                return answer;
            }
        }
        
        return answer;
    }
}