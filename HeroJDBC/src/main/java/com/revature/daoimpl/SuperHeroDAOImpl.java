package com.revature.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.SuperHero;
import com.revature.dao.SuperHeroDAO;
import com.revature.util.ComFactory;

public class SuperHeroDAOImpl implements SuperHeroDAO {
	// very important
	public static ComFactory cf = ComFactory.getInstance();
	public void createSuperHero(String heroName) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	public void createSuperHero(String heroName) throws SQLException {
		Connection com =  cf.getConnection();
		String sql = "{ call INSERTSUPERHERO(?)";
		CallableStatement call = com.prepareCall(sql);
		call.setString(1, heroName);
		// TODO fix this end statement! 
		call
	}
	

	public List<SuperHero> getSuperHeroList() throws SQLException {
		// Statement - compiled on the SQL side, generally not save
		// bad for sql injection - it is the backing for the other two
		
		// not using a singlton to keep from bogarting the connection to the DataBase
		List<SuperHero> superHeroList = new ArrayList<SuperHero>();
		Connection com = cf.getConnection();
		Statement stmt = com.createStatement();
		// What we get back form SQL
		ResultSet rs = stmt.executeQuery("SELECT * FROM SUPERHERO");
		SuperHero s = null;
		while(rs.next()) {
			//building an object from columns starting with '1'
			s = new SuperHero(rs.getInt(1), rs.getString(2));
			superHeroList.add(s);
		}
		return superHeroList;
	}
	
	
}
