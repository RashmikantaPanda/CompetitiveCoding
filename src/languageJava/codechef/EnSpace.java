/*      Problem Code: ENSPACE   Contest Code: COOK143

   Problem
        Chef's computer has N GB of free space. He wants to save X files, each of size 1 GB and Y files, each of size 2 GB on his computer.
         Will he be able to do so?

        Chef can save all the files on his computer only if the total size of the files is less than or equal to the space available on
        his computer.

        Input Format
        The first line contains an integer TT, denoting the number of test cases. The TT test cases then follow:
        The first and only line of each test case contains three integers N, X, Y denoting the free-space in computer,
        the number of 1 and 2 GB files respectively.
        Output Format
        For each test case, print YES if Chef is able to save the files and NO otherwise.

        You may print each character of the string in uppercase or lowercase (for example, the strings yEs, yes, Yes and YES will all be treated as identical).

        Input       Output
        4
        6 3 1       YES
        2 2 2       NO
        4 3 2       NO
        5 1 2       YES
*/
package languageJava.codechef;

import java.util.Scanner;

class EnSpace
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=b+c*2;
            if(d<=a){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
