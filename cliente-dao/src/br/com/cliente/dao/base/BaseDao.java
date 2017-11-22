package br.com.cliente.dao.base;

import java.sql.Connection;

import br.com.cliente.dao.IDefaultDao;

public abstract class BaseDao implements IDefaultDao {
	
	protected Connection conexao; 
	
	public BaseDao(Connection conexao) {
		this.conexao = conexao;
		
	}
	
}
