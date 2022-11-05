
/*      Problem Code: AUCTION   Contest Code: JULY221  Difficulty Rating : 330

Problem
        Alice, Bob and Charlie are bidding for an artifact at an auction.
        Alice bids A rupees, Bob bids B rupees, and Charlie bids C rupees (where A, B, and C are distinct).

        According to the rules of the auction, the person who bids the highest amount will win the auction.
        Determine who will win the auction.

        Input Format
        The first line contains a single integer T — the number of test cases. Then the test cases follow.
        The first and only line of each test case contains three integers A, B, and C, — the amount bid by Alice, Bob, and Charlie respectively.

        Output Format
        For each test case, output who (out of Alice, Bob, and Charlie) will win the auction.

        You may print each character of Alice, Bob, and Charlie in uppercase or lowercase (for example, ALICE, aliCe, aLIcE will be considered identical).

*/
package languageJava.codechef;

import java.util.Scanner;

public class Auction {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            int win=Math.max(a,Math.max(b,c));
            if(win==a){
                System.out.println("Alice");
            }
            else if(win==b){
                System.out.println("Bob");
            }
            else{
                System.out.println("Charlie");
            }
        }
    }
}
