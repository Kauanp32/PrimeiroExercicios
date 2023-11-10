package PrimeiroExercicios;

import javax.swing.JOptionPane;

public class Palavras {

	public static void main(String args [])throws InterruptedException {
		
		String palavras = JOptionPane.showInputDialog("Escreva uma palavra");
		
		for (int i = 0; i <= palavras.length(); i++) {
		JOptionPane.showMessageDialog (null, "letra: " + (i+1) + palavras.charAt(i) );
		
	
		}
		
	}
	
}
	