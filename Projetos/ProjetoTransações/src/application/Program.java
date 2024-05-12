package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		try {
			conn = DB.getConnection();
			
			conn.setAutoCommit(false); //Nao confirmar as operacoes automaticamente | Ops. ficaram pendentes, ate uma confirm. do programador
			
			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			/*
			int x = 1; 
			if(x < 2) { //Forcando excecao acontecer
				throw new SQLException("Fake error");
			}
			*/
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			conn.commit(); //Confirmador de transacao
			
			System.out.println("rows1: " + rows1);
			System.out.println("rows2: " + rows2);
		}
		catch(SQLException e) {
			try {
				conn.rollback(); //Voltar ao estado inicial do banco
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
