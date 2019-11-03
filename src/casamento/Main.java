package casamento;

import java.io.Console;
import java.util.Scanner;
import casamento.database.Database;

public class Main {
	public static void main( String args[] ) {
		
		
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
				
			}
			
			if(opcao == 3) {
				System.out.println("Qual o nome da familia?");
				 String familia = input.next();
				
				
				  System.out.println("Qual o numero da mesa que ele vai ficar?"); 
				  int mesa = input.nextInt();
				  
				  
				  System.out.println("Nessa parte voce irá adicionar os convidados!");
				  System.out.println(" "); 
				  int c_op = 10; 
				  do {
				  System.out.println("===========================");
				  System.out.println("Adicionar convidado ou Sair");
				  System.out.println("===========================");
				  System.out.println("1.\t Adicionar convidado");
				  System.out.println("2.\t Sair");
				  c_op = input.nextInt();
				  
				  if(c_op == 1) {
					  System.out.println("Digite o nome do convidado: ");
					  String nome_c = input.next(); 
					  System.out.println("O convidado é padrinho ou madrinha?");
					  System.out.println("Digite 0 para nenhum, 1 para padrinho e 2 para madrinha."); 
					  int PM = input.nextInt();
					  
					  if(PM == 1) {
					  String tipo_c = "F"; //F de familia, tipo para o banco
					  String padrinho = "true"; 
					  String madrinha = "false";
					  
					  Database.postC(nome_c, familia, tipo_c, padrinho, madrinha, mesa); 
					  }else if(PM == 2) { 
						  String tipo_c = "F"; 
						  String padrinho = "false";
						  String madrinha = "true";
					  
					  Database.postC(nome_c, familia, tipo_c, padrinho, madrinha, mesa); 
					  }else if(PM == 0) { 
						  String tipo_c ="F"; 
						  String padrinho = "false";
					      String madrinha = "false";
					  
					  Database.postC(nome_c, familia, tipo_c, padrinho, madrinha, mesa); 
					  
				  }
					  }
				  if(c_op == 2) {
					  c_op = 0; 
				  }else{
				  System.out.println("digite um valor válido."); 
				    } 
				  
				  
				  }while(c_op != 0); //end do
				  System.out.println("Qual o presente da familia?"); 
				  String presente = input.next();
				  System.out.println("Qual o local da compra?"); 
				  String local_compra = input.next();
				  Database.postP(presente, local_compra);
				 

			}//end if 3
			
			
			
			
			
			
			
			
			if(opcao == 6) {
				Database.list();
			}
			
			
			
			
		}while ( opcao != 0 ); //end do
		System.out.println("****************************************");
		System.out.println("\t\t Festa de Casamento");
		System.out.println("\t\t Obrigado!");
		System.out.println("****************************************");
		
		
	}// end main
}
