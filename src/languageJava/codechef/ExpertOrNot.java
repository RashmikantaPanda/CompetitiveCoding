/*      Problem Code : EXPERT

    Problem
        A problem setter is called an expert if at least 50% of their problems are approved by Chef.
        Munchy submitted X problems for approval. If Y problems out of those were approved, find whether Munchy is an expert or not.

    Input Format
        The first line of input will contain a single integer T, denoting the number of test cases.
        Each test case consists of a two space-separated integers X and Y - the number of problems submitted and the number of problems that were approved by Chef.
    Output Format
        For each test case, output on a new line YES, if Munchy is an expert. Otherwise, print NO.
*/
package languageJava.codechef;

import java.util.*;
public class ExpertOrNot
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        System.out.println("No of test case : ?");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("No of problem submitted - ");
            float x=sc.nextFloat();
            System.out.println("No of problem that are approved - ");
            float y=sc.nextFloat();
            float z=x/2;
            if(z<=y){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}

