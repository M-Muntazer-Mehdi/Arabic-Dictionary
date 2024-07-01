package businessLayer;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import word.Word;

public interface IBL {
	public void createDatabase() throws SQLException;
	public void createTable() throws SQLException;
	public void displayFiles(File file) throws SQLException;
	public void asalData(File file) throws SQLException;
	public void setData(String id, String rakam, String mashkool, String sinf, String asal, String jins,
						String adad, String ghairMashkool, String ghairAsal, String meaning, String jarh);
	public void retrieveData() throws SQLException;
	public ArrayList<Word> wordArr();
	public void addMeaning(String c1, String c2) throws SQLException;
	public ResultSet Find_like_view(String text) throws SQLException;
	public ResultSet Find_search_root(String text) throws SQLException;
	public ResultSet Find_search_view(String text) throws SQLException;	
}
