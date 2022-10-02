/*  Reverse a sentence word by word. Your program should take one string from the user
      as input and reverse that string word by word.
 */
package languageJava;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println("Enter a sentence : ");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] inpArr=input.split(" ");
        String result="";
        for (int i=inpArr.length-1; i>=0; i--){
            result=result+inpArr[i]+"-";
        }
        System.out.println("Reversed of the sentence by word is : "+result);
    }
}
