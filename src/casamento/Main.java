package casamento;

import java.io.Console;
import java.util.Scanner;
import casamento.database.Database;
import casamento.entity.Convidado;

public class Main {
	public static void main( String args[] ) {
		
		Convidado convidado = new Convidado();
		Scanner input = new Scanner(System.in);
		Console console = System.console();
		
		int opcao= 10;
		
		do {
			System.out.println("Festa de Casamento");	
			System.out.println("============");	
			System.out.println("1.\t Criar uma festa");	
			System.out.println("**********************************");
			System.out.println("2.\t Cadastrar um convidado");	
			System.out.println("3.\t Cadastrar uma familia");	
			System.out.println("**********************************");
			System.out.println("5.\t Editar convidado");	
			System.out.println("6.\t Listar convidados");	
			System.out.println("7.\t Listar festas");
			System.out.println("8.\t Listar padrinhos");
			System.out.println("**********************************");
			System.out.println("0.\t Encerrar sistema");	
			opcao = input.nextInt();
			
			if(opcao == 2) {
				
				System.out.print("Enter a string : ");
		        Scanner scanner = new Scanner(System. in);
		        String inputString = scanner. nextLine();
		        System.out.println("String read from console is : \n"+inputString);
				
			}
			
			if(opcao == 3) {
				

			}
			
			if(opcao == 4) {
				
				
			}
			
			if(opcao == 5) {
				
			}
			
			
			if(opcao == 6) {
				convidado.listar();;
			}
			
			if(opcao == 7) {
				
			}
			
			if(opcao == 8) {
				
			}
			
			
		}while ( opcao != 0 ); //end do
		System.out.println("****************************************");
		System.out.println("\t\t Festa de Casamento");
		System.out.println("\t\t Obrigado!");
		System.out.println("****************************************");
		
		
	}// end main
}
