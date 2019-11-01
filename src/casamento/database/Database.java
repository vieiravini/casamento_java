package casamento.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class Database {

	
	public static Connection getConnection() {
		
		final String DATABASE_URL = "jdbc:mysql://localhost:3306/casamento?useSSL=false";
		System.out.println("Conectando com o banco de dados...");
		
		try {
			Connection connection = null;
			connection = DriverManager.getConnection(DATABASE_URL, "root", "root" );
			System.out.println("Conectado com sucesso ao banco de dados!");
			return connection;
		}catch(Exception e) {
			System.out.println(e);
		};
		return null;
		
		
		
	};
	
	
	public static ArrayList<String> list() {
		try {
			Connection connection = getConnection();
			PreparedStatement statment = connection.prepareStatement("SELECT * FROM convidado");
			
			ResultSet result = statment.executeQuery();
			
			ArrayList<String> array = new ArrayList<String>();
			
			while(result.next()) {
				System.out.println(result.getString("nome"));
				array.add(result.getString("nome"));
			}
			System.out.println("All records have been selected");
			return array;
			
		}catch(Exception e){
			System.out.println(e);
		}
		return null;
		
	}
	
	
	
	public static void postC(String nome, String familia, String tipo_c, String padrinho, String madrinha, int mesa) {
		
		try {
			Connection connection = getConnection();
			PreparedStatement posted = connection.prepareStatement(
					"INSERT INTO convidado(nome, familia, tipo_convidado, padrinho, madrinha, mesa) "
					+ "VALUES ('"+nome+"','"+familia+"' , '"+tipo_c+"', '"+padrinho+"' , '"+madrinha+"','"+mesa+"'  )");
			posted.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		finally {
			System.out.println("Convidado salvo.");
		}
		
		
	}
	
	public static void postP(String descricao, String local_compra) {
		
		try {
			Connection connection = getConnection();
			PreparedStatement posted = connection.prepareStatement(
					"INSET INTO presente(descicao, local_compra) VALUES ('"+descricao+"', '"+local_compra+"'");
			posted.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	
}





