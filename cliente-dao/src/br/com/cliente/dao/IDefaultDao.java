package br.com.cliente.dao;

import java.util.List;

public interface IDefaultDao {
	
	public void insert() throws DaoErroTecnicoException;
	
	public boolean update() throws DaoErroTecnicoException;
	
	public List<?> select()throws DaoErroTecnicoException;
	
	public boolean delete()throws DaoErroTecnicoException;	

}
