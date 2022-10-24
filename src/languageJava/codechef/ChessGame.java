
/*          Problem Code: CHESSTIME     Contest Code:START47  Difficulty Rating - 337
Problem
        Chef has recently started playing chess, and wants to play as many games as possible.

        He calculated that playing one game of chess takes at least 2020 minutes of his time.

        Chef has N hours of free time. What is the maximum number of complete chess games he can play in that time?

        Input Format
        The first line of input will contain a single integer T, denoting the number of test cases.
        Each test case consists of a single line containing a single integer, N.

        Output Format
        For each test case, output on a new line the maximum number of complete chess games Chef can play in N hours.

        Input       Output
        4
        1           3
        10          30
        7           21
        3           9
*/


package languageJava.codechef;

import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=(x*60)/20;
            System.out.println(y);
        }

    }
}
