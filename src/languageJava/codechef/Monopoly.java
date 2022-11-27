
/*

Problem
        Chef is the financial incharge of Chefland and one of his duties is identifying if any company has gained a monopolistic advantage in the market.

        There are exactly 3 companies in the market each of whose revenues are denoted by R1,R2 and R3 respectively.
        A company is said to have a monopolistic advantage if its revenue is strictly greater than the sum of the revenues of its competitors.

        Given the revenue of the 3 companies, help Chef determine if any of them has a monopolistic advantage.

        Input Format
        The first line of input will contain a single integer T, denoting the number of test cases.
        Each test case consists of a single line of input containing three space separated integers R1,R2 and R3
        denoting the revenue of the three companies respectively.

        Output Format
        For each test case, output YES if any of the companies has a monopolistic advantage over its competitors, else output NO.

        You may print each character of the string in uppercase or lowercase (for example, the strings YeS,
        yEs, yes and YES will all be treated as identical).


      Input                 Output
        4
        1 1 1               No
        1 2 4               Yes
        2 10 3              Yes
        1 2 3               No
*/

package languageJava.codechef;

import java.util.*;
import java.lang.*;

class Monopoly
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if(((a+b)<c)||((a+c)<b)||((b+c)<a)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
