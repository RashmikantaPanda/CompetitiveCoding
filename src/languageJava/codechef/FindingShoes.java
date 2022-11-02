package languageJava.codechef;

import java.util.Scanner;

public class FindingShoes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int l=sc.nextInt();
            if(l>=n){
                System.out.println(n);
            }
            else{
                int required=n*2-l;
                System.out.println(required);
            }

        }
    }
}
