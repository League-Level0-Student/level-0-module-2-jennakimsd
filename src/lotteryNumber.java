import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumber {
public static void main(String[] args) {
	Random number= new Random();
	int lottery1=number.nextInt(151);
	int lottery2=number.nextInt(276);
	int lottery3=number.nextInt(51)+50;
	int lottery4=number.nextInt(337)+192;
	int lottery5=number.nextInt(600001);
	JOptionPane.showMessageDialog(null, lottery1 + ", " + lottery2 + ", " + lottery3 + ", " + lottery4 + ", " + lottery5);
}
}
