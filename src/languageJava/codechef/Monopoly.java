package languageJava.codechef;

import java.util.*;
import java.lang.*;

class Monopoly
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if(((a+b)<c)||((a+c)<b)||((b+c)<a)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
