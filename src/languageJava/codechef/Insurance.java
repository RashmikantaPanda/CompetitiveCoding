/*      Problem Code: INSURANCE      Contest Code: JULY222

Problem
        Chef bought car insurance. The policy of the insurance is:
        The maximum rebatable amount for any damage is Rs X lakhs.
        If the amount required for repairing the damage is \leq X≤X lakhs, that amount is rebated in full.
        Chef's car meets an accident and required Rs Y lakhs for repairing.

        Determine the amount that will be rebated by the insurance company.

        Input Format
            The first line of input will contain a single integer T, denoting the number of test cases.
            The first and only line of each test case contains two space-separated integers X and Y.
        Output Format
            For each test case, output the amount (in lakhs) that will be rebated by the insurance company.

             Input
                4
                5 3
                5 8
                4 4
                15 12

             Output
                3
                5
                4
                12
*/

package languageJava.codechef;

import java.util.Scanner;

class Insurance
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(Math.min(y, x));
            t--;
        }
    }
}
