
    /*
    Problem
        There are 100 questions in a paper. Each question carries +3 marks for correct answer, -1 marks for incorrect answer and 0 marks for unattempted question.

        It is given that Chef received exactly X(0 <= X <= 100 marks. Determine the minimum number of problems Chef marked incorrect.

        Input Format
        First line will contain T, number of test cases. Then the test cases follow.
        Each testcase contains of a single integer X, marks that Chef received.
        Output Format
        For each test case, output the minimum number of problems Chef marked incorrect.

        Input           Output
        4
        0               0
        100             2
        32              1
        18              0

*/
package languageJava.codechef;

import java.util.Scanner;

class Accuracy
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            if(x%3==0){
                System.out.println(0);
            }
            else{
                int a=((x/3)+1)*3-x;
                System.out.println(a);
            }
        }
    }
}
