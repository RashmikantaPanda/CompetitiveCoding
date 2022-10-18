package languageJava.codechef;

import java.util.Scanner;

class Insurance
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(Math.min(y, x));
            t--;
        }
    }
}
