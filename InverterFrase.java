package PrimeiroExercicios;

import javax.swing.JOptionPane;

public class InverterFrase {
    public static void main(String[] args) {
    	
    	String fraseQualquer, fraseSemEspaco;

		fraseQualquer = JOptionPane.showInputDialog(null, " Digite uma frase qualquer : ");
		JOptionPane.showMessageDialog(null, fraseQualquer);

		fraseSemEspaco = fraseQualquer.replace(" ", "");
		JOptionPane.showMessageDialog(null,
				" Com a modificação, a frase que antes era " + fraseQualquer + " passou a ser : " + fraseSemEspaco);

		String fraseInvertida = new StringBuilder(fraseSemEspaco).reverse().toString();
		JOptionPane.showMessageDialog(null, "Frase invertida: " + fraseInvertida);
	
    }

}

