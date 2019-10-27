package casamento.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Database {

	Connection connection = null;
	public Database() {
		
		final String DATABASE_URL = "jdbc:mysql://localhost:3306/casamentoDB?useSSL=false";
		System.out.println("Conectando com o banco de dados...");
		
		try {
			connection = DriverManager.getConnection(DATABASE_URL, "root", "root" );
			System.out.println("Conectado com sucesso ao banco de dados!");
		}catch(SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
	          System.out.println("SQLState: " + ex.getSQLState());
	          System.out.println("VendorError: " + ex.getErrorCode());
	          ex.printStackTrace();
		};
		
		
		
	};
	
	
	public void list() {
		Statement statement = null; 
	      ResultSet resultSet = null; 
	      Scanner input = new Scanner(System.in);
	      try
	      {

	         
	         statement = connection.createStatement();

	        
	         resultSet = statement.executeQuery("SELECT * FROM convidado");

	         
	         ResultSetMetaData metaData = resultSet.getMetaData();
	         int numberOfColumns = metaData.getColumnCount();
	         System.out.println( "Convidados:\n" );
	         
	         int opcao = 10;

	         for ( int i = 1; i <= numberOfColumns; i++ )
	            System.out.printf( "%-8s\t", metaData.getColumnName( i ) );
	         System.out.println();

	         while ( resultSet.next() ) {
	            for ( int i = 1; i <= numberOfColumns; i++ )
	               System.out.printf( "%-8s\t", resultSet.getObject( i ) );
	            System.out.println();
	         } 
	         
	         do {
	        	 System.out.println("*******************************");
	        	 System.out.println("Digite 1 para sair. \n");
	        	 System.out.println("Digite 2 para cadastrar outro convidado.\n");
	        	 opcao = input.nextInt();
	         
	         
	         if(opcao == 2) {
	        	 
	         }
	         
	         
	         
	         }while(opcao != 1);
	         System.out.println("****************************************");
	        
	        	 
	         
	      }  
	      catch ( SQLException ex )
	      {
	       
	          System.out.println("SQLException: " + ex.getMessage());
	          System.out.println("SQLState: " + ex.getSQLState());
	          System.out.println("VendorError: " + ex.getErrorCode());
	          ex.printStackTrace();
	      } 
	};
	
	
	
	public void register() {
		
		
		
	}
	
	
}





