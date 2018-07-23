import javax.swing.JOptionPane;

public class votingBooth {
public static void main(String[] args) {
	String input= JOptionPane.showInputDialog("How old are you?");
	int age=Integer.parseInt(input);
	if (age>18) {
		JOptionPane.showMessageDialog(null, "Who do you think the next president should be?");
	}
	if (age<18) {
		JOptionPane.showMessageDialog(null, "No one cares what you think.");
	}
}
}
