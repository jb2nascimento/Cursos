package br.com.cliente.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
<<<<<<< HEAD
import java.sql.ResultSet;
=======
>>>>>>> refs/remotes/origin/master
import java.sql.SQLException;
import java.util.List;

import br.com.cliente.dao.base.BaseDao;
import br.com.cliente.dao.base.FabricaDeConexao;
import br.com.cliente.dao.exception.DaoErroTecnicoException;

public class ClienteDao extends BaseDao {

	public ClienteDao(Connection conexao) {
		super(conexao);
<<<<<<< HEAD
		// TODO Auto-generated constructor stub
=======
>>>>>>> refs/remotes/origin/master
	}

	@Override
	public void insert() throws DaoErroTecnicoException {

		try {

			System.out.println("Iniciando insert");

			PreparedStatement statement = conexao.prepareStatement("INSERT INTO "
<<<<<<< HEAD
					+ "tb_cliente (nome, ultimo_nome, idade, usuario, senha)" + "VALUES (?, ?, ?, ?, ?)");

			statement.setString(1, "Alexsandro");
			statement.setString(2, "Silva");
			statement.setInt(3, 44);
			statement.setString(4, "aldsilva");
			statement.setString(5, "123456");

			statement.execute();

		} catch (Exception e) {

			throw new DaoErroTecnicoException("Ocorreu um erro ao executar o Insert", e);

		} finally {
			try {
				fecharConexao();
			} catch (SQLException e) {
				throw new DaoErroTecnicoException("Erro ao fechar conexao no Insert", e);
			}
		}

=======
					+ "tb_cliente (nome, ultimo_nome, idade, usuario, senha)" 
					+ "VALUES (?, ?, ?, ?, ?)");

			statement.setString(1, "Allan");
			statement.setString(2, "ta so olhando");
			statement.setInt(3, 24);
			statement.setString(4, "allanzinho");
			statement.setString(5, "123");

			statement.execute();

		} catch (Exception e) {	
			
			throw new DaoErroTecnicoException("Ocorreu um erro ao executar o Insert", e);
			
		} finally {
			
			try {
				fecharConexao();
			} catch (SQLException e) {
				throw new DaoErroTecnicoException("Erro ao fechar conexao no insert", e);
			}
		}	
		
		
>>>>>>> refs/remotes/origin/master
	}

	@Override
<<<<<<< HEAD
	public boolean update() throws DaoErroTecnicoException {

		try {

			System.out.println("Iniciando Update");

			PreparedStatement statement = FabricaDeConexao.getConexao()
					.prepareStatement("UPDATE tb_cliente SET ultimo_nome = ?, idade = ? WHERE id = ?");

			statement.setString(1, "L�zaro Silva");
			statement.setInt(2, 120);
			statement.setInt(3, 11);

			statement.execute();

		} catch (Exception e) {

			throw new DaoErroTecnicoException("Ocorreu um erro ao executar o Update", e);

		} finally {
			try {
				fecharConexao();
			} catch (SQLException e) {
				throw new DaoErroTecnicoException("Erro ao fechar conexao no Update", e);
			}
		}
=======
	public boolean update() {
>>>>>>> refs/remotes/origin/master
		return false;

	}

	@Override
<<<<<<< HEAD
	public List<?> select() throws DaoErroTecnicoException {

		try {

			System.out.println("Iniciando select");

			PreparedStatement statement = FabricaDeConexao.getConexao().prepareStatement("select * from tb_cliente");

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
		} catch (Exception e) {

			throw new DaoErroTecnicoException("Ocorreu um erro ao executar o Update", e);

		} finally {
			try {
				fecharConexao();
			} catch (SQLException e) {
				throw new DaoErroTecnicoException("Erro ao fechar conexao no Update", e);
			}
		}

		return null;

=======
	public List<?> select() {
		// TODO Auto-generated method stub
		return null;
>>>>>>> refs/remotes/origin/master
	}

	@Override
	public boolean delete() throws DaoErroTecnicoException {

		try {

			System.out.println("Iniciando delete");

			PreparedStatement statement = conexao.prepareStatement("delete from tb_cliente where id in (?, ?, ?, ?)");

			statement.setInt(1, 13);
			statement.setInt(2, 14);
			statement.setInt(3, 15);
			statement.setInt(4, 16);

			statement.execute();

		} catch (Exception e) {

			throw new DaoErroTecnicoException("Ocorreu um erro ao executar o Delete", e);

		} finally {
			try {
				fecharConexao();
			} catch (SQLException e) {
				throw new DaoErroTecnicoException("Erro ao fechar conexao no Delete", e);
			}

		}
		return false;

<<<<<<< HEAD
	}

=======
>>>>>>> refs/remotes/origin/master
}
