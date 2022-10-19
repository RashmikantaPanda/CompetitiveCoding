/*
Problem
        Chef has 33 numbers A, BA,B and C.

        Chef wonders if it is possible to choose exactly two numbers out of the three numbers such that their sum is odd.

        Input Format
        The first line of input will contain a single integer T, denoting the number of test cases.
        Each test case consists of three integers A, B, C.
        Output Format
        For each test case, output YES if you can choose exactly two numbers with odd sum, NO otherwise.

        The output is case-insensitive. Thus, the strings YES, yes, yeS, and Yes are all considered the same.

        Input
        4
        1 2 3
        8 4 6
        3 3 9
        7 8 6

        Output
        YES
        NO
        NO
        YES

*/
package languageJava.codechef;
import java.util.Scanner;

public class OddSumPair
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int x=(a+b)%2;
            int y=(c+b)%2;
            int z=(a+c)%2;
            if(x!=0||y!=0||z!=0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
