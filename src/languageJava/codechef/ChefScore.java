
/*      Problem Code: 2CHEFSCORE

Problem
        In a test, there are N problems, each carrying X marks.
        In each problem, Chef either received X marks or 0 marks.

        Determine whether is it possible for Chef to achieve exactly Y marks.

        Input Format
        The first line of input will contain a single integer T, denoting the number of test cases.
        Each test case consists of three integers N, X and Y, the number of problems, the maximum score for each problem,
         and the score Chef wants.
        Output Format
        For each test case, output YES if Chef can achieve exactly YY marks, NO otherwise.

        You can print each character of the string in uppercase or lowercase. For example, the strings Yes, YES, yes,
        and yEs, are all considered identical.

        Input               Output
        5
        1 8 4                  NO
        3 6 12                 YES
        4 5 0                  YES
        10 10 100              YES
        8 5 36                 NO

*/
package languageJava.codechef;

import java.util.*;
import java.lang.*;

class ChefScore
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            int x=(a*b-c)%b;
            if(x!=0){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
