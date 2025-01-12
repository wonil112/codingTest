    class Solution {
        public int solution(String binomial) {
            int answer = 0;
            int firstidx = 0;
            int secondidx = 0;

            for (int i = 0; i < binomial.length(); i++) {
                if(binomial.charAt(i) == ' ') {
                    if (firstidx == 0) {
                        firstidx = i;
                    } else {
                        secondidx = i;
                        break;
                    }
                }
            }

            int firstNum = Integer.parseInt(binomial.substring(0, firstidx));
            int secondNum = Integer.parseInt(binomial.substring(secondidx + 1));
    
            if(binomial.substring(firstidx + 1, secondidx).equals("+")) {
                answer = firstNum + secondNum;
            } else if (binomial.substring(firstidx + 1, secondidx).equals("-")) {
                answer = firstNum - secondNum;
            } else {
                answer = firstNum * secondNum;
            }

            return answer;
        }
    }