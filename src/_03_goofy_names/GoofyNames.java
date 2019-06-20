package _03_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {

		// 1. Ask the user to enter their name

		String Name = JOptionPane.showInputDialog(null, "Enter Your Name: ");

		// 2. Print upper case name to the console using .toUpperCase()
		// Run your program to see that this works.

		// 3. Loop through each character of the name (steps 4 - 6).
		// HINT: Use .length() to determine the number of characters in the String.

		// 4. Create a String variable to store the next character of the name
		// using .substring(start, end)
		// HINT: replace 'start' and 'end' to get String with character at i

		String goofyName = "";

		for (int i = 0; i < Name.length(); i++) {
			if (i % 2 == 0) {

				goofyName += Name.substring(i, i + 1).toUpperCase();
				
			} else {
				goofyName += Name.substring(i, i + 1).toLowerCase();
				
				System.out.println(goofyName);
				JOptionPane.showMessageDialog(null, goofyName);
			}

		}
	}
}

// 5. Use MODULO to set this variable to upper case for EVEN characters
// and lower case for ODD characters.

// 6. ADD this String (containing 1 char) to the goofyName String

// 7. Use pop-up to show user their Goofy name
