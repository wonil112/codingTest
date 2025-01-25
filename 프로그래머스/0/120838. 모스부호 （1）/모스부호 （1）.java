class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] temp = letter.split(" ");

        for(int i = 0; i < temp.length; i++) {
            if (temp[i].equals(".-")) {
                answer += "a";
            } else if (temp[i].equals("-...")) {
                answer += "b";
            } else if (temp[i].equals("-.-.")) {
                answer += "c";
            } else if (temp[i].equals("-..")) {
                answer += "d";
            } else if (temp[i].equals(".")) {
                answer += "e";
            } else if (temp[i].equals("..-.")) {
                answer += "f";
            } else if (temp[i].equals("--.")) {
                answer += "g";
            } else if (temp[i].equals("....")) {
                answer += "h";
            } else if (temp[i].equals("..")) {
                answer += "i";
            } else if (temp[i].equals(".---")) {
                answer += "j";
            } else if (temp[i].equals("-.-")) {
                answer += "k";
            } else if (temp[i].equals(".-..")) {
                answer += "l";
            } else if (temp[i].equals("--")) {
                answer += "m";
            } else if (temp[i].equals("-.")) {
                answer += "n";
            } else if (temp[i].equals("---")) {
                answer += "o";
            } else if (temp[i].equals(".--.")) {
                answer += "p";
            } else if (temp[i].equals("--.-")) {
                answer += "q";
            } else if (temp[i].equals(".-.")) {
                answer += "r";
            } else if (temp[i].equals("...")) {
                answer += "s";
            } else if (temp[i].equals("-")) {
                answer += "t";
            } else if (temp[i].equals("..-")) {
                answer += "u";
            } else if (temp[i].equals("...-")) {
                answer += "v";
            } else if (temp[i].equals(".--")) {
                answer += "w";
            } else if (temp[i].equals("-..-")) {
                answer += "x";
            } else if (temp[i].equals("-.--")) {
                answer += "y";
            } else if (temp[i].equals("--..")) {
                answer += "z";
            }
        }

        return answer;
    }
}