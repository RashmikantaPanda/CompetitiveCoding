/*  Problem Code: EQUALDIST     Contest Code:START42  Difficulty Rating : 330

Problem
        Alice and Bob are very good friends and they always distribute all the eatables equally among themselves.

        Alice has A chocolates and Bob has B chocolates. Determine whether Alice and Bob can distribute all the chocolates equally among themselves.

        Note that:

        It is not allowed to break a chocolate into more than one piece.
        No chocolate shall be left in the distribution.

        Input Format
        The first line of input will contain an integer T — the number of test cases. The description of TT test cases follows.
        The first and only line of each test case contains two space-separated integers AA and BB, the number of chocolates that Alice and Bob have, respectively.
        Output Format
        For each test case, output on a new line YES if Alice and Bob can distribute all the chocolates equally, else output NO.
        The output is case insensitive, i.e, yes, YeS, yES will all be accepted as correct answers when Alice and Bob can distribute the chocolates equally.
*/

package languageJava.codechef;

import java.util.Scanner;

public class EqualDist {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a+b;
            if(c%2==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
