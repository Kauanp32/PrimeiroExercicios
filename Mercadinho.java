package PrimeiroExercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Mercadinho {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Connection connection = null;
		
	//Estabelecer conexao com o banco de dados
		
		String urlBanco = "jdbc:mysql://localhost:3306/mercadinho";
		String usuario = "root";
		String senha = "senai";
		
		try { 
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(urlBanco, usuario, senha);
			return;
			
		} catch (SQLException e) {System.out.print( "Erro ao estabelecer a conexão com o banco de dados: " + e.getMessage());
            System.exit(1);}
		
		String nome;
		int quantidade;
		double valor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto:");
		nome = sc.nextLine();
		
		System.out.println("Digite a quantidade do produto");
		quantidade = sc.nextInt();
		
		System.out.println("Digite o valor do produto");
		
	
		

	}

}
