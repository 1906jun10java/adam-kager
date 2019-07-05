package com.revature.driver;

import java.sql.SQLException;

import com.revature.daoimpl.PowersDAOImpl;
import com.revature.daoimpl.SuperHeroDAOImpl;

public class Driver {

	public static void main(String[] args) {
		SuperHeroDAOImpl shdi = new SuperHeroDAOImpl();
		PowersDAOImpl pdi = new PowersDAOImpl();
		try {
			System.out.println(shdi.getSuperHeroList());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pdi.createPowers("FLIGHT");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			shdi.createSuperHero("Black Panther");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
