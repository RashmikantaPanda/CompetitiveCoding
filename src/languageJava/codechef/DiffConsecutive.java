   /* Problem
        Chef has a binary string SS of length N. Chef can perform the following operation on S:

        Insert any character (0 or 1) at any position in S.
        Find the minimum number of operations Chef needs to perform so that no two consecutive characters are same in S.

        Input Format
            The first line contains a single integer T — the number of test cases. Then the test cases follow.
            The first line of each test case contains an integer N — the length of the binary string S.
            The second line of each test case contains a binary string S of length N containing 0s and 1s only.
        Output Format
             For each test case, output on a new line the minimum number of operations Chef needs to perform so that no two consecutive characters are same in SS.

                Input
                3
                2
                11
                4
                0101
                5
                00100

                Output
                1
                0
                2
*/
package languageJava.codechef;

import java.util.Scanner;

class DiffConsecutive
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            String input=sc.next();


            int count=0;
            for(int i=0; i<x-1; i++){
                char a=input.charAt(i);
                if(a==input.charAt(i+1)){
                    count++;
                }

            }
            System.out.println(count);

        }
    }
}
