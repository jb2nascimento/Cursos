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
		
		System.out.println("Iniciando execucao");
		
		//insert();
		
		select();
		
		update();
		
		select();
		
	}

	private static void select() throws ClassNotFoundException, SQLException {
		

		System.out.println("Inicinando select");
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection conexaoComMeuBanco = DriverManager.getConnection(urlConnection);
		
		System.out.println("Conexao realizada com sucesso. Realizado Select");
		
		PreparedStatement statement = conexaoComMeuBanco.prepareStatement("select * from tb_cliente");
		
		ResultSet result = statement.executeQuery();
		
		while (result.next()) {
			
			int id = result.getInt("id");
			String nome = result.getString(2);
			String sobrenome = result.getString(3);
			int idade = result.getInt(4);
			String usuario = result.getString(5);
			String senha = result.getString(6);
			
			System.out.println(id + " " + nome + " " + sobrenome + " " + idade + " " + usuario + " " + senha);		
			
		}
		
		conexaoComMeuBanco.close();
	}
	
	private static void insert() throws ClassNotFoundException, SQLException {
		
		System.out.println("Realizando insert");
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection conexaoComMeuBanco = DriverManager.getConnection(urlConnection);
		
		System.out.println("Realizando insert");
		
		PreparedStatement statement = conexaoComMeuBanco.prepareStatement("INSERT INTO " + "tb_cliente (nome, ultimo_nome, idade, usuario, senha)"
				+ "VALUES (?, ?, ?, ?, ?)");
		
		statement.setString(1, "Daniel");
		statement.setString(2, "Barbosa");
		statement.setInt(3, 24);
		statement.setString(4,  "dfb");
		statement.setString(5, "12334");
		
		statement.execute();
		
			
		conexaoComMeuBanco.close();
				
	}
	
	private static void update() throws ClassNotFoundException, SQLException {
		
		System.out.println("Update realizando");
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection conexaoComMeuBanco = DriverManager.getConnection(urlConnection);
				
		System.out.println("Realizando update");
		
		PreparedStatement statement = conexaoComMeuBanco.prepareStatement("Update tb_cliente set idade = ? where nome = ?");
		
		statement.setInt(1, 30);
		statement.setString(2, "Daniel");
		
		statement.execute();
		
		
		conexaoComMeuBanco.close();
		
			
	}
}
