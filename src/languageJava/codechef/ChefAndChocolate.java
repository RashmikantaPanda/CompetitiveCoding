
/*      Problem Code:CHEFCHOCO  Contest Code:START30  Difficulty Rating:492
Problem
        Chef wants to gift C chocolates to Botswal on his birthday. However, he has only X chocolates with him.
        The cost of 11 chocolate is Y rupees.

        Find the minimum money in rupees Chef needs to spend so that he can gift C chocolates to Botswal.

        Input Format
        First line will contain T, number of test cases. Then the test cases follow.
        Each test case contains of a single line of input, three integers C, X and Y.

        Output Format
        For each test case, output in a single line answer, the minimum money in rupees Chef needs to spend.

        Input               Output
        2
        7 5 5               10
        10 1 1              9

*/

package languageJava.codechef;

import java.util.Scanner;

public class ChefAndChocolate {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=(a-b)*c;
            System.out.println(d);

        }

    }
}
