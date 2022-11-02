/*      Problem Code: TRANSFORM     Contest Code:LTIME107   Difficulty Rating:649
Problem
        Mario transforms each time he eats a mushroom as follows:

        If he is currently small, he turns normal.
        If he is currently normal, he turns huge.
        If he is currently huge, he turns small.
        Given that Mario was initially normal, find his size after eating X mushrooms.

        Input Format
        The first line of input will contain one integer T, the number of test cases. Then the test cases follow.
        Each test case contains a single line of input, containing one integer X.
        Output Format
        For each test case, output in a single line Mario's size after eating X mushrooms.

        Print:

        NORMAL, if his final size is normal.
        HUGE, if his final size is huge.
        SMALL, if his final size is small.
        You may print each character of the answer in either uppercase or lowercase

        Inout               Output
        3                   SMALL
        2                   HUGE
        4                   NORMAL
        12
 */

package languageJava.codechef;

import java.util.Scanner;

public class Transform {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            String str1[]={"NORMAL","HUGE","SMALL"};
            System.out.println(str1[a%3]);


        }
    }
}
