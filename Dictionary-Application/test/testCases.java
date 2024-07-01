import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import dataAccessLayer.DAO;

public class testCases {
	static DAO obj;
	
	testCases(){
		obj = new DAO();
	}
	
	@Test
	void testDbConnectionNotNull() throws SQLException {
		Connection con = obj.dbConnection();
		Assertions.assertNotNull(con);
	}
	
	@Test
	void testDbConnectionValid() throws SQLException {
		Connection con = obj.dbConnection();
		Assertions.assertTrue(con.isValid(0));
	}
	
	@Test
	void checkRoot() {
		String stem = "مُبَانٌ";
		Assertions.assertEquals("بين", obj.stem(stem));
	}
	
	@Test
	void checkNormalize() {
		String normalize = "مُبَيَّضَةٌ";
		Assertions.assertEquals("مبيضة", obj.normalize(normalize));
	}
	
	@Test
	void searchMashkool() throws SQLException {
		String mashkool = "مَجْمُوعٌ";
		Connection con = obj.dbConnection();
		String str = "";
		boolean flag = false;
		
		ResultSet rs = obj.find(con, mashkool);
		while(rs.next()) {
			str = rs.getString(3);
			flag = true;
		}
		Assertions.assertTrue(flag);
	}
	
	@Test
	void searchNotMashkool() throws SQLException {
		String mashkool = "اِنْكَبَّ";
		Connection con = obj.dbConnection();
		String str = "";
		boolean flag = false;
		
		ResultSet rs = obj.find(con, mashkool);
		while(rs.next()) {
			str = rs.getString(3);
			flag = true;
		}
		Assertions.assertFalse(flag);
	}
	
	@Test
	void searchRoot() throws SQLException {
		String root = "قشر";
		Connection con = obj.dbConnection();
		String str = "";
		boolean flag = false;
		
		ResultSet rs = obj.find_Root(con, root);
		while(rs.next()) {
			str = rs.getString(11);
		}
		Assertions.assertEquals(root, str);
	}
}
