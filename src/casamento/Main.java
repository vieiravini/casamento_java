package casamento;

import java.io.Console;
import java.util.Scanner;
import casamento.database.Database;

public class Main {
	public static void main( String args[] ) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Console console = System.console();
		
		int opcao= 10;
		
		do {
			System.out.println("Festa de Casamento");	
			System.out.println("============");	
			System.out.println("1.\t Criar uma festa");	
			System.out.println("**********************************");
			System.out.println("2.\t Cadastrar um convidado");	
			System.out.println("3.\t Cadastrar um padrinho");	
			System.out.println("4.\t Cadastrar uma familia");
			System.out.println("**********************************");
			System.out.println("5.\t Editar convidado");	
			System.out.println("6.\t Listar convidados");	
			System.out.println("7.\t Listar festas");
			System.out.println("8.\t Listar padrinhos");
			System.out.println("**********************************");
			System.out.println("0.\t Encerrar sistema");	
			opcao = input.nextInt();
			
			if(opcao == 2) {
				System.out.println("Digite o nome do convidado:");
				String nome_convidado = console.readLine();
				System.out.println("Digite o nome da familia do convidado, se estiver sozinho, deixe em branco");
				String nome_familia = console.readLine();
				System.out.println("Digite o numero da mesa que o convidado vai ficar:");
				int numero_mesa = input.nextInt();
			}
			
			
			
			
			
			
			
			
			if(opcao == 6) {
				Database database = new Database();
				database.list();
			}
			
			
			
			
		}while ( opcao != 0 );
		System.out.println("****************************************");
		System.out.println("\t\t Festa de Casamento");
		System.out.println("\t\t Obrigado!");
		System.out.println("****************************************");
		
		
	}
}
