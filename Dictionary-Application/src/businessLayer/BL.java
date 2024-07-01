package businessLayer;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dataAccessLayer.DAO;
import word.Word;

public class BL implements IBL{

	public static ArrayList<Word> word;
	static DAO dao;	
	
	public BL() {
		dao = new DAO();
	}
	

	public void createDatabase() throws SQLException {
		dao.createDatabase();
		}
	public void createTable() throws SQLException {
		dao.createTable(dao.dbConnection());
	}
	public void displayFiles(File file) throws SQLException {
		dao.readCsv(dao.dbConnection(),file);
		asalData(file);
	}
	
	public void asalData(File file) throws SQLException {
		dao.asalData(dao.dbConnection(), file);
	}
	
	public void setData(String id, String rakam, String mashkool, String sinf, String asal, String jins,
			String adad, String ghairMashkool, String ghairAsal, String meaning, String jarh) {
		Word w = new Word(id, rakam, mashkool, sinf, asal, jins, adad, ghairMashkool, ghairAsal, meaning, jarh);
		word.add(w);
	}
	
	public ArrayList<String> combo(){
		ArrayList<String> roots = new ArrayList<>();
		for(Word w : word) {
			String r = w.getJarh();
			String [] str = r.split(",");
			for(String root : str) {
				System.out.println(str.toString());
				roots.add(root);
			}
		}
		return roots;
	}
	public void retrieveData() throws SQLException {
		word = new ArrayList<Word>();
		dao.getData(dao.dbConnection());
	}
	
	
	public ArrayList<Word> wordArr() {
		return word;
	}
	
	public void addMeaning(String c1, String c2) throws SQLException {
		dao.addMeanings(dao.dbConnection(),c1, c2);
	}
	
	public void addUpdate(String c1,String c2) throws SQLException {
		dao.updateData(dao.dbConnection(),c1,c2);
	}
	
	public ResultSet Find_like_view(String text) throws SQLException 
	{
		DAO S = new DAO();
		ResultSet rs = null; 
		rs = S.find_like(dao.dbConnection(),text);
		return rs;
	}
	
	public ResultSet Find_search_root(String text) throws SQLException
	{
		DAO S = new DAO();
		ResultSet rs = null; 
		rs = S.find_Root(dao.dbConnection(),text);
		return rs;
	}

	public ResultSet Find_search_view(String text) throws SQLException
	{
		DAO S = new DAO();
		ResultSet rs = null; 
		rs = S.find(dao.dbConnection(),text);
		return rs;
	}



}
