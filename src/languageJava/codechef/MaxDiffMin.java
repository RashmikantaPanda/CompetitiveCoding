package languageJava.codechef;

import java.util.*;
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int max=Math.max(a,Math.max(b,c));
            int min=Math.min(a,Math.min(b,c));
            System.out.println(max-min);
        }
    }
}
