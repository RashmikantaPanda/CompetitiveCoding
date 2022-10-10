/*Problem :
        Chef has to travel to another place. For this, he can avail any one of two cab services.
            The first cab service charges X rupees.
            The second cab service charges Y rupees.
            Chef wants to spend the minimum amount of money. Which cab service should Chef take?

Input Format:
        The first line will contain T - the number of test cases. Then the test cases follow.
        The first and only line of each test case contains two integers X and Y -
            the prices of first and second cab services respectively.

Output Format:
For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.*/

package languageJava.codechef;

import java.util.Scanner;

public class MinPriceCab {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("How many test case ? ");
        int t;
        t = sc.nextInt();
        while (t != 0) {
            System.out.println("Enter x : ");
            int x = sc.nextInt();
            System.out.println("Enter y : ");

            int y = sc.nextInt();
            if (x > y) {
                System.out.println("SECOND");
            } else if (x == y) {
                System.out.println("ANY");
            } else {
                System.out.println("FIRST");
            }

            t--;
        }
    }
}
