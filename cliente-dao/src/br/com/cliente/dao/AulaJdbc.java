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
		// TODO Auto-generated method stub
	
		System.out.println("Iniciano Execução");
		
		
		update();
		select(); 
	
	}
		
	private static void select() throws ClassNotFoundException, SQLException {
		System.out.println("Realizando select");
	
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		Connection conexaoComMeuBanco = DriverManager.getConnection(urlConnection);
	
		System.out.println("Conexão realizada com sucesso. Realizando Select");
		
		PreparedStatement statement = conexaoComMeuBanco.prepareStatement( "select * from tb_cliente");
		
		ResultSet result = statement.executeQuery();	
		
		while(result.next()) {
			
			int id = result.getInt("id");
			String nome = result.getString(2);
			String sobrenome = result.getString(3);
			String usuario = result.getString(4);
			String senha = result.getString(5);

			System.out.println(id + " " + nome + " " + sobrenome + " " + usuario + " " + senha);
			
		}
		
		conexaoComMeuBanco.close();
						
	}

	private static void insert() throws ClassNotFoundException, SQLException {
		
		System.out.println("Iniciando insert");
	
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		Connection conexaoComMeuBanco = DriverManager.getConnection(urlConnection);
		
		System.out.println("Realizando insert");
		
		PreparedStatement statement = conexaoComMeuBanco.prepareStatement("INSERT INTO " + "tb_cliente (nome, ultimo_nome, idade, usuario, senha)"
		+ "VALUES (?, ?, ?, ?, ?)");
		
		statement.setString(1, "Lucas");
		statement.setString(2, "Mendes");
		statement.setInt(3, 31);
		statement.setString(4, "lmb");
		statement.setString(5, "l123");
		
		boolean deuCerto = statement.execute();
		
		if(deuCerto)
			System.out.println("Insert realizado com sucesso");
		else
			System.out.println("Insert realizado com erro");
		
		conexaoComMeuBanco.close();
		
	}
	
	private static void update() throws ClassNotFoundException, SQLException {
		
		System.out.println("Iniciando update");
	
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		Connection conexaoComMeuBanco = DriverManager.getConnection(urlConnection);
				
		
		PreparedStatement statement = conexaoComMeuBanco.prepareStatement("UPDATE tb_cliente SET nome = ?, ultimo_nome = ? WHERE id = ? ");
		
		statement.setString(1, "Lukas");
		statement.setString(2, "Mendez");
		statement.setInt(3, 7);
		
		statement.execute();
							
		conexaoComMeuBanco.close();
}
	
}
