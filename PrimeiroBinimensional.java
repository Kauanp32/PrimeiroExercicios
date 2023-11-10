package PrimeiroExercicios;

public class PrimeiroBinimensional {

	public static void main(String[] args) {
		int [][] matriz = {{0,1}, {2,3}};
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
				
			}
			 System.out.println();
		
		}
	
	}

}
