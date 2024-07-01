package dataAccessLayer;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOFascade implements IDAOFascade {
	private IDAO obj;
	
	DAOFascade(){
		obj = new DAO();
	}
	
	@Override
	public Connection Connection(String url) throws SQLException {
		return obj.Connection(url);
	}

	@Override
	public Connection db(String url, String dbName) throws SQLException {
		return obj.db(url, dbName);
	}

	@Override
	public Connection dbConnection() throws SQLException {
		return obj.dbConnection();
	}

	@Override
	public boolean checkDbExistence(Connection con, String dbName) throws SQLException {
		return obj.checkDbExistence(con, dbName);
	}

	@Override
	public void createDatabase() throws SQLException {
		obj.createDatabase();
	}

	@Override
	public void createTable(Connection con) throws SQLException {
		obj.createTable(con);
	}

	@Override
	public String stem(String root) {
		return obj.stem(root);
	}

	@Override
	public String normalize(String input) {
		return obj.normalize(input);
	}

	@Override
	public void readCsv(Connection con, File file) throws SQLException {
		obj.readCsv(con, file);
	}

	@Override
	public void asalData(Connection con, File file) throws SQLException {
		obj.asalData(con, file);
	}

	@Override
	public void addMeanings(Connection con, String c1, String c2) {
		obj.addMeanings(con, c1, c2);	
	}

	@Override
	public void getData(Connection con) throws SQLException {
		obj.getData(con);
	}

	@Override
	public ResultSet find(Connection con, String s) {
		return obj.find(con, s);
	}

	@Override
	public ResultSet find_like(java.sql.Connection con, String s) {
		return obj.find_like(con, s);
	}

	@Override
	public ResultSet find_Root(java.sql.Connection con, String s) {
		return obj.find_Root(con, s);
	}

}
