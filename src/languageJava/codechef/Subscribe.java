package languageJava.codechef;

import java.util.Scanner;

class Subscribe
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            if(a<=30){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
