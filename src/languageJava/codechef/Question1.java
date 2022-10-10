/*

   Problem :  Chef has a string SS with him. Chef is happy if the string contains a contiguous substring of length
              strictly greater than 2 in which all its characters are vowels.

              Determine whether Chef is happy or not.

  Input Format:
              First line will contain T, number of test cases. Then the test cases follow.
              Each test case contains of a single line of input, a string S.
  Output Format:
              For each test case, if Chef is happy, print HAPPY else print SAD.

  */

package languageJava.codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t;
        String s;
        char[] ch;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many input you want  ? ");
        t=Integer.parseInt(br.readLine());
        while( t-- > 0 ) {
            boolean found=false;
            System.out.println("Enter a String : ");
            s=br.readLine();
            ch=s.toLowerCase().toCharArray();
            for(int i=0; i<ch.length-2; i++)
            {
                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
                {
                    int k;
                    k=1+i;
                    if(ch[k]=='a'||ch[k]=='e'||ch[k]=='i'||ch[k]=='o'||ch[k]=='u')
                    {
                        int j;
                        j=1+k;
                        if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
                        {
                            System.out.println("Happy");
                            found=true;
                            break;
                        }

                    }

                }

            }
            if(!found){
                System.out.println("--> Sad");
            }
        }
    }
}
