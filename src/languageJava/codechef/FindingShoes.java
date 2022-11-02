/*
    Problem Code: FINDSHOES     Contest Code:START32  Difficulty Rating:646

Problem

Chef has N friends. Chef promised that he would gift a pair of shoes (consisting of one left shoe and one right shoe) to each of his N friends.
 Chef was about to go to the marketplace to buy shoes, but he suddenly remembers that he already had M left shoes.

What is the minimum number of extra shoes that Chef will have to buy to ensure that he is able to gift a pair of shoes to each of his N friends?

For example, if N = 2 ,M = 4 then Chef already has 4 left shoes, so he must buy 2 extra right shoes to form 2 pairs of shoes.

Therefore Chef must buy at least 22 extra shoes to ensure that he is able to get N = 2 pairs of shoes.

Input Format
The first line contains a single integer T - the number of test cases. Then the test cases follow.
The first line of each test case contains two integers N and M - the number of Chef's friends and the number of left shoes Chef has.
Output Format
For each test case, output the minimum number of extra shoes that Chef will have to buy to ensure that he is able to get N pairs of shoes.

    Input              Output
    3
    2 4                 2
    6 0                 12
    4 3                 5
*/

package languageJava.codechef;

import java.util.Scanner;

public class FindingShoes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int l=sc.nextInt();
            if(l>=n){
                System.out.println(n);
            }
            else{
                int required=n*2-l;
                System.out.println(required);
            }

        }
    }
}
