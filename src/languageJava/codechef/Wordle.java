/*Problem Code:WORDLE   Contest Code:MARCH221

    Problem
    Chef invented a modified wordle.
    There is a hidden word S and a guess word T, both of length 5.

    Chef defines a string M to determine the correctness of the guess word. For the ith index:

    If the guess at the ith index is correct, the ith character of M is G.
    If the guess at the ith index is wrong, the ith character of M is B.

    Given the hidden word S and guess T, determine string M.

Input Format
    First line will contain T, number of test cases. Then the test cases follow.
    Each test case contains of two lines of input.
    First line contains the string S - the hidden word.
    Second line contains the string T - the guess word.
Output Format
    For each test case, print the value of string M.

    You may print each character of the string in uppercase or lowercase
    */
package languageJava.codechef;

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("NO. of test case : ");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter first String of Length 5 : ");
            String x=sc.next();
            System.out.println("Enter second String of length 5 : ");
            String y=sc.next();
            char[] z =new char[5];
            for(int i=0;i<z.length;i++) {
                if(x.toLowerCase().charAt(i)==y.toLowerCase().charAt(i)){
                        z[i]='G';
                }
                else{
                    z[i]='B';
                }
            }


            for (char c : z) {
                System.out.print(c);
            }
            System.out.println();
            t--;
        }
    }
}
