package br.com.cliente.dao.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {
<<<<<<< HEAD
	
	private static Connection conexao;
	
	private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	private static String urlConnection = "jdbc:sqlserver://vmdbsjan.database.windows.net:1433;"
			+ "database=db_cursos;"
			+ "user=jan@vmdbsjan;"
			+ "password=jnasci@01;"
			+ "encrypt=false;"
			+ "trustServerCertificate=false;"
			+ "hostNameInCertificate=*.database.windows.net;"
			+ "loginTimeout=30";	
			
	
	public static Connection getConexao() throws SQLException, ClassNotFoundException {
		
		if (conexao == null || conexao.isClosed()) {
			//criar conexao
			Class.forName(driver);
			conexao = DriverManager.getConnection(urlConnection);
			
		}
		
		return conexao;
	}
	
	public static void fecharConexao() throws SQLException {
		if (conexao != null)
			conexao.close();
	}
}
=======

	private static Connection conexao;

	private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	private static String urlConnection = "jdbc:sqlserver://vmdbsjan.database.windows.net:1433;" + "database=db_cursos;"
			+ "user=jan@vmdbsjan;" + "password=jnasci@01;" + "encrypt=false;" + "trustServerCertificate=false;"
			+ "hostNameInCertificate=*.database.windows.net;" + "loginTimeout=30";

	public static Connection getConexao() throws ClassNotFoundException, SQLException {
		if (conexao == null || conexao.isClosed()) {
			Class.forName(driver);
			conexao = DriverManager.getConnection(urlConnection);
		}
		return conexao;
	}

}













>>>>>>> branch 'master' of https://github.com/jb2nascimento/Cursos.git
