/*
    Problem
    Chef has a square-shaped chart paper with the side length equal to N. He wants to cut out K times K×K squares from this chart paper.

    Find the maximum number of K times K×K squares he can cut from the entire chart paper.

    Note that, some part of the chart paper might not be a included in any K \times K×K cutout square.

  Input Format
    The first line contains a single integer T — the number of test cases. Then the test cases follow.
    The first and only line of each test case contains two space-separated integers N and K — the side length
    of the entire chart paper and the side length of the cutout squares.
  Output Format
    For each test case, output on a new line the maximum number of K \times K×K squares Chef can cut from the entire chart paper.
*
* */

package languageJava.codechef;

import java.util.Scanner;

public class PaperCut
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("No. of test case : ");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Square shape (Initially)");
            int x=sc.nextInt();
            System.out.println("You want square of : ");
            int y=sc.nextInt();
            System.out.println("Possible square : ");
            int z=(x/y)*(x/y);
            System.out.println(z);
            t--;
        }
    }
}

