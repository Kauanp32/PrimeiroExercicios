package PrimeiroExercicios;

import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String mesIngles [] = {"January","February", "March", "April", "May" ,"June" ,"July", "August", "September" ,"October" ,"November" ,"December"};
		String mes [] = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto","setembro", "outubro","novembro","dezembro "};
		
		byte numeroMes [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

		for (int i = 0; i < 12; i++) {
		System.out.println("Digite 1 para portugues 2 para ingles ");
			int idioma = sc.nextInt();
			if (idioma == 1) {
				System.out.println(numeroMes[i] +(" ") + mes[i]);
			}else{
				System.out.println(numeroMes[i] +(" ") + mesIngles[i]);
				
			}
		
			
		}
	
	}

}