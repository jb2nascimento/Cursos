package br.com.cliente.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.cliente.dao.exception.DaoErroTecnicoException;

public interface IDefaultDao {
<<<<<<< HEAD
	
	public void insert() throws SQLException, ClassNotFoundException;
	
	public boolean update();
	
	public List<?> select();
	
	
	public boolean delete();	
=======

	public void insert() throws DaoErroTecnicoException;

	public boolean update() throws DaoErroTecnicoException;

	public List<?> select() throws DaoErroTecnicoException;

	public boolean delete() throws DaoErroTecnicoException;
>>>>>>> branch 'master' of https://github.com/jb2nascimento/Cursos.git

}
 