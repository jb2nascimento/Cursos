package br.com.cliente.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.cliente.dao.base.FabricaDeConexao;



public class AulaJdbc {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	
		System.out.println("Iniciano Execução");
		
		
		update();
		select(); 
	
	}
		
	private static void select() throws ClassNotFoundException, SQLException {
		System.out.println("Realizando select");
	
			
		PreparedStatement statement = FabricaDeConexao.getConexao().prepareStatement( "select * from tb_cliente");
		
		ResultSet result = statement.executeQuery();	
		
		while(result.next()) {
			
			int id = result.getInt("id");
			String nome = result.getString(2);
			String sobrenome = result.getString(3);
			String usuario = result.getString(4);
			String senha = result.getString(5);

			System.out.println(id + " " + nome + " " + sobrenome + " " + usuario + " " + senha);
			
		}
		
				
	}

	
	
	private static void update() throws ClassNotFoundException, SQLException {
		
		System.out.println("Iniciando update");
	
		
		PreparedStatement statement = FabricaDeConexao.getConexao().prepareStatement("UPDATE tb_cliente SET nome = ?, ultimo_nome = ? WHERE id = ? ");
		
		statement.setString(1, "Lukas");
		statement.setString(2, "Mendez");
		statement.setInt(3, 7);
		
		statement.execute();
		
		FabricaDeConexao.fecharConexao();

}
	
}
