package languageJava.codechef;

import java.util.Arrays;
import java.util.Scanner;

class SecondMax
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("No of test case : ");
        int t=sc.nextInt();
        while(t-->0){
            int[] arr =new int[3];
            System.out.println("Enter 3 number : ");
            for(int i=0;i<3;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Second largest number is : ");
            System.out.println(arr[1]);
        }
    }
}

