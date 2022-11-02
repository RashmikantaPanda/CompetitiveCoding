/*
    Problem Code: TASTEDEC

* */
package languageJava.codechef;

import java.util.Scanner;

public class TestDec {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();

            if(x*2>y*5){
                System.out.println("Chocolate");
            }
            else if(x*2==y*5){
                System.out.println("Either");
            }
            else{
                System.out.println("Candy");
            }
        }
    }
}
