package br.com.cliente.dao.base;

import java.sql.Connection;
<<<<<<< HEAD

import br.com.cliente.dao.IDefaultDao;

public abstract class BaseDao implements IDefaultDao {
	
	protected Connection conexao; 
	
	public BaseDao(Connection conexao) {
		this.conexao = conexao;
		
=======
import java.sql.SQLException;

import br.com.cliente.dao.IDefaultDao;

public abstract class BaseDao implements IDefaultDao {

	protected Connection conexao;

	public BaseDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	public void fecharConexao() throws SQLException {
		if (conexao != null) {
			conexao.close();
		}
>>>>>>> branch 'master' of https://github.com/jb2nascimento/Cursos.git
	}
	
}
