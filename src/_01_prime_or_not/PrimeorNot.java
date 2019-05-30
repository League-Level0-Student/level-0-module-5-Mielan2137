package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeorNot {

	public static void main(String[] args) {
		String Primenumber = JOptionPane.showInputDialog("Give us a number:");
		int prim = Integer.parseInt(Primenumber);
		for (int i=2; i<prim; i++) {
			if(prim%i==0) {
				System.out.println(prim +" is not Prime");
				JOptionPane.showMessageDialog(null,prim +" is not Prime");
				System.exit(0);
			}
		}
					System.out.println(prim+ " is Prime");
					JOptionPane.showMessageDialog(null,prim +" is Prime");
					System.exit(0);
	} 
}
