
/*
  Problem :
    Chef took an examination two times. In the first attempt, he scored X marks while in the second attempt he scored Y marks.
    According to the rules of the examination, the best score out of the two attempts will be considered as the final score.
  Input Format
    The first line contains a single integer T — the number of test cases. Then the test cases follow.
    The first line of each test case contains two integers X and Y — the marks scored by Chef in the first attempt and
     second attempt respectively.
  Output Format
    For each test case, output the final score of Chef in the examination.
    Determine the final score of the Chef.
    */
package languageJava.codechef;

import java.util.Scanner;

public class BestOfTwo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How many test case ? ");
        int t = scn.nextInt();
        while( t-- > 0 ) {
            System.out.println("Enter first mark : ");
            int x = scn.nextInt();
            System.out.println("Enter second mark : ");
            int y = scn.nextInt();
            System.out.println( "Best Score  : "+Math.max( x, y) );
        }
    }
}

