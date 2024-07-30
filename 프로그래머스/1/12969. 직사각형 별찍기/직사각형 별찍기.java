import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String star = "*";

        char[][] stars = new char[b][a];
        for (int i = 0; i < b; i++) {
            System.out.println(star.repeat(a));
        }
    }
}