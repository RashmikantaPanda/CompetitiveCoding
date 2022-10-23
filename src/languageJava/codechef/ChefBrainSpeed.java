/*          Problem Code: CBSPEED
Contest Code:START41

Problem
        In ChefLand, human brain speed is measured in bits per second (bps). Chef has a threshold limit of XX bits per second above which his calculations are prone to errors. If Chef is currently working at YY bits per second, is he prone to errors?

        If Chef is prone to errors print YES, otherwise print NO.

        Input Format
        The only line of input contains two space separated integers XX and YY — the threshold limit and the rate at which Chef is currently working at.

        Output Format
        If Chef is prone to errors print YES, otherwise print NO.

        You may print each character of the string in uppercase or lowercase (for example, the strings yes, Yes, yEs, and YES will all be treated as identical).

*/
package languageJava.codechef;

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefBrainSpeed
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(y>x){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
