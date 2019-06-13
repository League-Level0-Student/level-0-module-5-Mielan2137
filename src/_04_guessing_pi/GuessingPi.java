package _04_guessing_pi;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */
// 2. Make a String variable to hold the value of Pi.
		//    Get the first few digits from http://www.piday.org/million/.

		// 3. Print out the first 3 digits of Pi to the console.
		//    The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		//    Run your program to see how this works.

		// 9. If you want to give the user more than one chance to guess,
		//    put a for loop around steps 4-8.

			// 4. Create a for loop that will step through each digit of pi (steps 5-8)
			//    NOTE: The number of digits in your string will be
			//       yourStringVariable.length()

				// 5. Ask the user for the NEXT digit of pi.

				// 6. Compare the user's input to the next digit of your pi variable 
				//    (look at step 3 for a clue).
				//    HINT: use charAt(0) to get 1st char of user input String 

					// 7. If they are correct, print out "correct".

					// 8. If they are not, print out "incorrect" and tell them
					//    to start over. Use 'break;' to break out of the loop.
import javax.swing.JOptionPane;

public class GuessingPi {
public static void main(String[] args) {
	
	String Pi = "3.14159265359";
	
	for(int i=0; i<Pi.length();i++) {
		System.out.println(Pi.charAt(i));
		
	String Guess = JOptionPane.showInputDialog("Enter the correct order of tokens that displays the value of PI starting with the first number individually.");
	if(Guess.equals(Pi.charAt(i)+"")) {
		
		JOptionPane.showMessageDialog(null, "HURRAAAYYYYYY.....YOU ARE CORRECT !!!");
		JOptionPane.showMessageDialog(null, "Now continue to enter each following token inividually to see if you can list out all the charecters.");
		
	}
	else{
		JOptionPane.showMessageDialog(null, "You have ruined the consequitive sequence of the fabulous number that is represented by Pi. YOU HAVE FAILED. DUM DUM DUUUMMMMMM");	
		JOptionPane.showMessageDialog(null, "YOU SUCK. YOU SHOULD POOP YOURSELF FOR RUINING SUCH A MAGESTIC NUMBER YOU FOUL SMELL");
		JOptionPane.showMessageDialog(null, "BTW BEYUNCE IS IRRELIVENT. So irrelivent in fact that I misspelled her name and yo didnt even notice...You just went back to check...You're so predictable...Beyonce sucks");
break;	
	}		
	}
}

	
}
