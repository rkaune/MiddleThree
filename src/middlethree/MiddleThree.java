/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package middlethree;
import java.util.Scanner;
 
 /**
 * Displays the middle three characters of a string.
 */
 public class MiddleThree {

	public static void main(String[] args) {
		String phrase, threeLetters, replaceExample;
                //String check = "This is the string that is being checked";
		int phraseLength;
		int mid;
		Scanner input = new Scanner(System.in);
		
		/* get string from user */
		System.out.print("Enter text (at least three characters): ");
		phrase = input.nextLine();
		input.close();
		
		/* determine middle of phrase */
		phraseLength = phrase.length();
		mid = phraseLength / 2;
				
		/* display middle three characters */
		threeLetters = phrase.substring(mid - 1, mid + 2);
		System.out.println("Middle three characters are: " + threeLetters);
//                /* get string from user */
//		System.out.print("Enter text (at least three characters): ");
//		phrase = input.nextLine();
//		input.close();
//		
//		/* determine middle of phrase */
//		phraseLength = phrase.length();
//		mid = phraseLength / 2;
				
//		/* display middle three characters */
//		replaceExample = check.replaceFirst("being checked","Brad");
//		System.out.println("The replacement is: " + replaceExample);
	}

}
