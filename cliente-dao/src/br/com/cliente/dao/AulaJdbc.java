package br.com.cliente.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AulaJdbc {

	private static String urlConnection = "jdbc:sqlserver://vmdbsjan.database.windows.net:1433;"
			+ "database=db_cursos;"
			+ "user=jan@vmdbsjan;"
			+ "password=jnasci@01;"
			+ "encrypt=false;"
			+ "trustServerCertificate=false;"
			+ "hostNameInCertificate=*.database.windows.net;"
			+ "loginTimeout=30";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("Iniciando execução");
		//insert();
		//update() ;
		//delete();
		select();

	}
	
	private static void select() throws ClassNotFoundException, SQLException {
		
		System.out.println("Realizando select");		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conexaoComMeuBanco = DriverManager.getConnection(urlConnection);
		
		System.out.println("Conexão realizada com sucesso. Realizando select");
		
		PreparedStatement statement = conexaoComMeuBanco.prepareStatement("SELECT * FROM TB_CLIENTE");
		ResultSet result =  statement.executeQuery();
		
		while(result.next()) {
			
			int id = result.getInt(1); //result.getInt("id");
			String nome = result.getString(2); //result.getString("nome");
			String sobreNome =	result.getString(3); //result.getString("ultimo_nome");
			int idade = result.getInt(4); //result.getInt("idade");
			String usuario = result.getString(5); //result.getString("usuario");
			String senha = result.getString(6); //result.getString("senha");
			
			System.out.println(id + " " + nome + " " + sobreNome + " " + idade + " " + usuario + " " + senha);	
			
		}
		
		conexaoComMeuBanco.close();
				
	}
	
	@SuppressWarnings("unused")
	private static void insert() throws ClassNotFoundException, SQLException {
		
		System.out.println("Iniciando insert");
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conexaoComMeuBanco = DriverManager.getConnection(urlConnection);
		
		System.out.println("Realizando insert");
		
		PreparedStatement statement = conexaoComMeuBanco.prepareStatement("INSERT INTO "
				+ "TB_CLIENTE (nome, ultimo_nome, idade, usuario, senha) "
				+ "VALUES (?, ?, ?, ?, ?)");
		
		statement.setString(1, "Cátia");
		statement.setString(2, "Silva");
		statement.setInt(3, 35);
		statement.setString(4, "capsilva");
		statement.setString(5, "@35&68*");
		
		statement.execute();
						
		conexaoComMeuBanco.close();
		
	}	
	
	@SuppressWarnings("unused")
	private static void update() throws ClassNotFoundException, SQLException {
		
		System.out.println("Iniciando update");
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conexaoComMeuBanco = DriverManager.getConnection(urlConnection);
		
		System.out.println("Realizando update");
		
		PreparedStatement statement = conexaoComMeuBanco.prepareStatement("UPDATE TB_CLIENTE SET nome = ?, ultimo_nome = ? WHERE id = ?");
					
		statement.setString(1, "Allan");
		statement.setString(2, "A");
		statement.setInt(3, 2);
		
		statement.execute();
		
		conexaoComMeuBanco.close();
		
	}
	
	@SuppressWarnings("unused")
	private static void delete() throws ClassNotFoundException, SQLException {
		
		System.out.println("Iniciando delete");
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conexaoComMeuBanco = DriverManager.getConnection(urlConnection);
		
		System.out.println("Realizando delete");
		
		PreparedStatement statement = conexaoComMeuBanco.prepareStatement("DELETE FROM TB_CLIENTE WHERE id = ?");
		
		statement.setInt(1, 9);
		
		statement.execute();		
		
		conexaoComMeuBanco.close();
		
	}
	
	
	

}
