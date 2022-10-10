package languageJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Name of the class has to be "Main" only if the class is public. */
public class CodeChefQ1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t;
        String s;
        char[] ch;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        t=Integer.parseInt(br.readLine());
        while( t-- > 0 ) {
            boolean found=false;
            s=br.readLine();
            ch=s.toCharArray();
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
                System.out.println("Sad");
            }
        }
    }
}
