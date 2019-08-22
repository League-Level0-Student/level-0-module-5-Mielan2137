package _07_skill_practice;

import javax.swing.JOptionPane;

public class SkillPractice {
		
}


/*
 * public static void main(String[] args) { String dimes =
 * JOptionPane.showInputDialog("How many dimes do you have?"); int Dime =
 * Integer.parseInt(dimes); int cents=Dime*10;
 * JOptionPane.showMessageDialog(null, "You have " + cents+ " cents"); }
 */



/*
 * public static void main(String[] args) { String inches =
 * JOptionPane.showInputDialog("How many inches are you in height?"); int in =
 * Integer.parseInt(inches); if (in >= 36) { JOptionPane.showMessageDialog(null,
 * "Yaayyyy you may continue eating your Wheaties"); }
 * 
 * else if (in < 36) { JOptionPane.showMessageDialog(null,
 * "EAT YOUR WHEATIES!!!"); } }
 */

/*
 * public static void main(String[] args) { int IN = 30; for(int i=0; i<IN; i++)
 * { if(i%3==0) { System.out.println(i); } } }
 */



/*
 * public static void main(String[] args) {
 * 
 * String FN = JOptionPane.showInputDialog("Give us a number"); int FNI =
 * Integer.parseInt(FN);
 * 
 * String SN = JOptionPane.showInputDialog("Give us a second number"); int SNI =
 * Integer.parseInt(SN);
 * 
 * int LN = FNI - SNI;
 * 
 * JOptionPane.showMessageDialog(
 * null,"The difference between your two numbers is " + LN);
 * 
 * }
 */



/*
public static void main(String[] args) {

String city = JOptionPane.showInputDialog("What city do you live in?");
if(city.contentEquals("San Diego")) {
	JOptionPane.showMessageDialog(null, "Congrats. You live in America's finest city.");
}
else {
	JOptionPane.showMessageDialog(null, "Move to San Diego you loser");
	
	String cars = JOptionPane.showInputDialog("Does your family have a car? If so, how many?");
		int CI = Integer.parseInt(cars);
			
		if(CI==1) {
	String model = JOptionPane.showInputDialog("What model car is it?");
		JOptionPane.showMessageDialog(null, "Great. Use your "+ model + " to get to San Diego.");}
			
		if(CI>1) {
			int TW = CI*4;
			JOptionPane.showMessageDialog(null, "You are in the possesion of "+ TW + " wheel's." + " Use them.");
		}
}
}
*/



/*
public static void main(String[] args) {
String S = JOptionPane.showInputDialog("What is the name of your school?");
JOptionPane.showMessageDialog(null, "Wow!!! "+ S + " is a great school!!!");

}
*/