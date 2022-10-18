/*
        Problem Code: TAXES  Contest Code: START60


Problem
        In Chefland, a tax of rupees 1010 is deducted if the total income is strictly greater than rupees 100.
        Given that total income is X rupees, find out how much money you get.

        Input Format
            The first line of input will contain a single integer T, denoting the number of test cases.
            The first and only line of each test case contains a single integer X — your total income.
        Output Format
             For each test case, output on a new line, the amount of money you get.
              Input         Output
                4              5
                105            95
                101            91
                100            100
*/
package languageJava.codechef;

import java.util.Scanner;

public class Taxes
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0){
            int x=sc.nextInt();
            int y;
            if(x>100){
                y=x-10;
                System.out.println(y);
            }
            else{
                System.out.println(x);
            }
            t--;

        }
    }
}
