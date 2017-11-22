package br.com.cliente.dao;

import java.sql.SQLException;
import java.util.List;

public interface IDefaultDao {
	
	public void insert() throws SQLException, ClassNotFoundException;
	
	public boolean update();
	
	public List<?> select();
	
	
	public boolean delete();	

}
 