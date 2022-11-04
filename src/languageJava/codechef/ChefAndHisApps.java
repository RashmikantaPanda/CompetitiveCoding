

/*Problem Code: CHEFAPPS        Contest Code: START45   Difficulty Rating:702


Problem
        Chef's phone has a total storage of SS MB. Also, Chef has 2 apps already installed on his phone which occupy X MB and Y MB respectively.

        He wants to install another app on his phone whose memory requirement is Z MB. For this,
        he might have to delete the apps already installed on his phone.
        Determine the minimum number of apps he has to delete from his phone so that he has enough memory to install the third app.

        Input Format
        The first line contains a single integer TT — the number of test cases. Then the test cases follow.
        The first and only line of each test case contains four integers S, X, Y and Z — the total memory of Chef's phone,
        the memory occupied by the two already installed apps and the memory required by the third app.

        Output Format
        For each test case, output the minimum number of apps Chef has to delete from his phone so that he can install the third app.

        Input                   Output
        4
        10  1 2 3                  0
        9   4 5 1                  1
        15  5 10 15                2
        100 20 30 75               1



*/

package languageJava.codechef;

import java.util.*;
import java.lang.*;

class ChefAndHisApps
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int s=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();

            int a=s-(x+y);

            if(a>=z){
                System.out.println(0);
            }
            else{
                int b=Math.max(x,y);
                int c=Math.min(x,y);
                if((s-c)>=z){
                    System.out.println(1);

                }
                else{
                    System.out.println(2);
                }
            }

        }
    }
}
