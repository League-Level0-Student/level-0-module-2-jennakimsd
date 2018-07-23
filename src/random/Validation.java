//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		

		// 1. Use each value of randomNumber to give the user a random compliment.
	
if (randomNumber==0) {
	JOptionPane.showMessageDialog(null, "You are beautiful!");
}
if (randomNumber==1) {
	JOptionPane.showMessageDialog(null, "You are smart!");
}
if (randomNumber==2) {
	JOptionPane.showMessageDialog(null, "Your outfit looks really nice today!");
}
if (randomNumber==3) {
	JOptionPane.showMessageDialog(null, "You are very talented!");
}
if (randomNumber==4) {
	JOptionPane.showMessageDialog(null, "You are very good at sports!");
}}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
