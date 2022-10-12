/*   Problem Code: INCRIQ       Contest Code:MARCH222

    Problem
        A study has shown that playing a musical instrument helps in increasing one's IQ by 7 points.
        Chef knows he can't beat Einstein in physics, but he wants to try to beat him in an IQ competition.

        You know that Einstein had an IQ of 170170, and Chef currently has an IQ of X.

        Determine if, after learning to play a musical instrument, Chef's IQ will become strictly greater than Einstein's.

        Print "Yes" if it is possible for Chef to beat Einstein, else print "No" (without quotes).

     Input Format
        The first and only line of input will contain a single integer X, the current IQ of Chef.

     Output Format
        For each testcase, output in a single line "Yes" or "No"
*/

package languageJava.codechef;

import java.util.*;
import java.lang.*;

public class IncreaseIQ
{
    public static void main (String[] args)
    {
        int x,y=170;
        System.out.println("Your IQ : ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        if(x+7>y){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

