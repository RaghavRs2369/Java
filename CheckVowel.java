package practice;

import java.util.Scanner;
public class CheckVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in =new Scanner (System.in);
      System.out.println("Enter  an Alphabet:");
        char Alphabet = in.next().charAt(0);
         
        if (Alphabet == 'a' || Alphabet == 'e' || Alphabet =='i' || Alphabet =='o' || Alphabet == 'u')
        {
        	System.out.println( Alphabet  +  "is  a  Vowel");
        }
        else
        {
        	System.out.println(  Alphabet  + "is  a Consonant");
        }
	}

}
