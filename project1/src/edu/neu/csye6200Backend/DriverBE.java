package edu.neu.csye6200Backend;

import java.sql.SQLException;

public class DriverBE {
	public static void main(String[] args) {
		try {
			DBBasicConnection dbc = new DBBasicConnection();
			dbc.Demo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
