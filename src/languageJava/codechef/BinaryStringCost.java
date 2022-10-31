
/*      Problem Code:BSCOST     Contest Code:START32      Difficulty Rating:1069
Problem
        According to the new tax scheme, a new tax called the binary string tax was introduced! JJ has a binary string SS of length NN. According to the tax scheme,
         for every occurrence of 01 in S, a tax of X rupees will be charged, while for every occurrence of 10 in S, a tax of Y rupees will be charged.

        For example, if X = 5, Y = 7 and S = 11010, then S has 1 occurrence of 0101 and 2 occurrences of 10, so the tax charged = 5 x 1 + 7 x 2 = 19

        JJ can rearrange the string S in any way he wants. He wants to minimize the amount of tax he has to pay. Can you help him do so?

        Input Format
        The first line contains a single integer T - the number of test cases. Then the test cases follow.
        The first line of each test case contains three integers N, X and Y - the length of the binary string S, the tax charged on an occurrence of 0101 and the tax charged on an occurrence of 1010.
        The second line of each test case contains a binary string S of length N containing 0s and 1s only.

        Output Format
        For each test case, output the minimum amount of tax that JJ has to pay.

        Input           Output
        2
        4 7 3
        1101               3
        5 3 4
        00000              0

*/
package languageJava.codechef;

import java.util.Scanner;

public class BinaryStringCost {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();

            String str=sc.next();
            //char charArr[]=str.toCharArray();
            boolean one=false;
            boolean zero=false;
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i)=='1'){
                    one=true;
                }
                if(str.charAt(i)=='0'){
                    zero=true;
                }
            }
            if(zero && one){
                System.out.println(Math.min(x,y));
            }
            else{
                System.out.println("0");
            }
        }
    }
}
