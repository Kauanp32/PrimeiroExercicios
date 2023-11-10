package PrimeiroExercicios;

public class VerificadorConteudo {
    public static void main(String[] args) {
        
    	String frase = "Conteudo +18";
    
            if (frase.toLowerCase().contains("sexo") || frase.toLowerCase().contains("sexual")) {
            
            System.out.println("Conteudo Negado");
        
          } else {
           
        	System.out.println("Conteudo liberado");
        }
    }
}