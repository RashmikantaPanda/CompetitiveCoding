/*  Problem Code: CHAIRS_   Contest Code:JUNE221
    Problem
Chef's coding class is very famous in Chefland.

This year X students joined his class and each student will require one chair to sit on.
Chef already has YY chairs in his class.
Determine the minimum number of new chairs Chef must buy so that every student is able to get one chair to sit on.

==Input Format==
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers X and Y —
 the number of students in the class and the number of chairs Chef already has.
==Output Format==
For each test case, output the minimum number of extra chairs Chef must buy so that every student gets one chair.

Constraints
*
* */
package languageJava.codechef;

import java.util.Scanner;

public class ChairRequare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x<=y){
                System.out.println(0);
            }
            else{
                System.out.println(x-y);
            }
        }
    }
}
