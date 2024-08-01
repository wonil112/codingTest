class Solution {
    public String solution(int a, int b) {
        
        // 1 - 31 / 2 - 29 / 3 - 31 / 4 - 30 / 5 - 31 / 6 - 30 / 7 - 31 / 8 - 31 / 9 - 30
        // 10 - 31 / 11 - 30 / 12 - 31
        
        // 직전월까지의 일 합계를 담을 변수 선언
        int sumDay = 0;
        
         // if(a == 2) 일때는 29
        // else if(a < 8 && a % 2 != 0) 일때는 31일
        // else if(a < 8 && a % 2 == 0) 일때는 30일
        // else if(a >= 8 && a % 2 == 0) 일때는 31일
        // else 30일
        for(int i = 1; i < a; i++) {
            if(i < 8 && i % 2 != 0) {
                sumDay += 31;
            } else if(i < 8 && i % 2 == 0 && i != 2) {
                sumDay += 30;
            } else if(i == 2) {
                sumDay += 29;
            } else if(i >= 8 && i % 2 == 0) {
                sumDay += 31;
            } else {
                sumDay += 30;
            }
        }
        
        // THU, FRI, SAT, SUN, MON, TUE, WED 배열
        String[] dayList = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        
        // 월을 가지고 위 조건문 돌면서 그 달의 첫째날이 무슨 요일인지 구하고
        // 해당 일을 가지고 다시 요일을 구함.
        // 총 수를 7로 나눈 나머지와 일치하는 인덱스
        sumDay += b;
        int dayIdx = sumDay % 7;
        
        return dayList[dayIdx];
    }
}