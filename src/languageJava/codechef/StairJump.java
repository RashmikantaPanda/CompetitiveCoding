/*
        Problem Code: XJUMP

Problem
        Chef is currently standing at stair 0 and he wants to reach stair numbered X.
        Chef can climb either Y steps or 1 step in one move.
        Find the minimum number of moves required by him to reach exactly the stair numbered X

        Input Format
            The first line of input will contain a single integer T, denoting the number of test cases.
            Each test case consists of a single line of input containing two space separated integers X and Y denoting
            the number of stair Chef wants to reach and the number of stairs he can climb in one move.

        Output Format
            For each test case, output the minimum number of moves required by him to reach exactly the stair numbered X

            Input       Output
            4
            4 2            2
            8 3            4
            3 4            3
            2 1            2
 */
package languageJava.codechef;

import java.util.Scanner;

class StairJump
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c = a / b;
            if(a%b==0) {
                System.out.println(c);
            }
            else{
                c=a/b+a%b;
                System.out.println(c);
            }


        }
    }
}
