package br.com.cliente.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.cliente.dao.base.BaseDao;
import br.com.cliente.dao.base.FabricaDeConexao;

public class ClienteDao extends BaseDao {

	public ClienteDao(Connection conexao) {
		super(conexao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert() throws SQLException, ClassNotFoundException {
				
			System.out.println("Iniciando insert");
		
			PreparedStatement statement = FabricaDeConexao.getConexao().prepareStatement("INSERT INTO " + "tb_cliente (nome, ultimo_nome, idade, usuario, senha)"
			+ "VALUES (?, ?, ?, ?, ?)");
			
			statement.setString(1, "Lucas");
			statement.setString(2, "Mendes");
			statement.setInt(3, 31);
			statement.setString(4, "lmb");
			statement.setString(5, "l123");
			
			FabricaDeConexao.fecharConexao();
			
				
		}
		


	@Override
	public boolean update() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<?> select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	

}












