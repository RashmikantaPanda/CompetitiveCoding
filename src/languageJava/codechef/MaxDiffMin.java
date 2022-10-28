
/*      Problem Code: MAXDIFFMIN    Contest Code:START62   Difficulty Rating:339

Problem
        Chef is given 33 integers A, B and C such that A < B < C.

        Chef needs to find the value of max(A, B, C) - min(A, B, C).

        Here max(A, B, C) denotes the maximum value among A, B, C while min(A, B, C) denotes the minimum value among A, B,C.

        Input Format
        The first line of input will contain a single integer T, denoting the number of test cases.
        Each test case consists of 3 integers A, B,C.
        Output Format
        For each test case, output the value of max(A, B, C) - min(A, B, C).

*/
package languageJava.codechef;

import java.util.*;
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int max=Math.max(a,Math.max(b,c));
            int min=Math.min(a,Math.min(b,c));
            System.out.println(max-min);
        }
    }
}
