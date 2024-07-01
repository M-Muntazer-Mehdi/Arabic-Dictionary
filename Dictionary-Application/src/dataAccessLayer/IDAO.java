package dataAccessLayer;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface IDAO {
	public Connection Connection(String url) throws SQLException;
	public Connection db(String url, String dbName) throws SQLException;
	public Connection dbConnection() throws SQLException;
	public boolean checkDbExistence(Connection con, String dbName) throws SQLException;
	public void createDatabase() throws SQLException;
	public void createTable(Connection con) throws SQLException;
	public String stem(String root);
	public String normalize(String input);
	public void readCsv(Connection con ,File file) throws SQLException;
	public void asalData(Connection con, File file) throws SQLException;
	public void addMeanings(Connection con, String c1, String c2);
	public void getData(Connection con) throws SQLException;
	public ResultSet find(Connection con, String s);
	public ResultSet find_like(Connection con , String s);
	public ResultSet find_Root(Connection con, String s);
}
