package businessLayer;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import word.Word;

public class BLFascade implements IBLFascade {
	IBL obj;
	
	BLFascade(){
		obj = new BL();
	}
	@Override
	public void createDatabase() throws SQLException {
		obj.createDatabase();
	}

	@Override
	public void createTable() throws SQLException {
		obj.createTable();
	}

	@Override
	public void displayFiles(File file) throws SQLException {
		obj.displayFiles(file);
	}
	
	@Override
	public void asalData(File file) throws SQLException {
		obj.asalData(file);
	}
	@Override
	public void setData(String id, String rakam, String mashkool, String sinf, String asal, String jins, String adad,
			String ghairMashkool, String ghairAsal, String meaning, String jarh) {
		obj.setData(id, rakam, mashkool, sinf, asal, jins, adad, ghairMashkool, ghairAsal, meaning, jarh);
	}

	@Override
	public void retrieveData() throws SQLException {
		obj.retrieveData();
	}

	@Override
	public ArrayList<Word> wordArr() {
		return obj.wordArr();
	}

	@Override
	public void addMeaning(String c1, String c2) throws SQLException {
		obj.addMeaning(c1, c2);
	}

	@Override
	public ResultSet Find_like_view(String text) throws SQLException {
		return obj.Find_like_view(text);
	}

	@Override
	public ResultSet Find_search_root(String text) throws SQLException {
		return obj.Find_search_root(text);
	}

	@Override
	public ResultSet Find_search_view(String text) throws SQLException {
		return obj.Find_search_view(text);
	}
	

}
