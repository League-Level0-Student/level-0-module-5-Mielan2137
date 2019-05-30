import javax.swing.JOptionPane;

public class fibonacci {
public static void main(String[] args) {
	int high=1;
	int low=0;
	int temp=0;
	for(int i=0;i<10;i++) {
	temp=high;
	high=low+high;
	low=temp;
	System.out.println(high);
	}
	
	
}
}
