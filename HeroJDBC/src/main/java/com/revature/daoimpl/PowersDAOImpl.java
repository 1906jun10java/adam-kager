package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.util.ComFactory;

public class PowersDAOImpl {
	public static ComFactory cf = ComFactory.getInstance();
	
	//Prepared Statement
	public void createPowers(String powerName) throws SQLException {
		Connection com =  cf.getConnection();
		String sql = "INSERT INTO POWERS VALUES(POWSEQ.NEXTVAL,?";
		PreparedStatement ps = com.prepareStatement(sql);
		ps.setString(1, powerName);
		ps.executeUpdate();
	}
}
