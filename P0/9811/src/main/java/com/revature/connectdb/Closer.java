package com.revature.connectdb;
import com.revature.connectdb.ConnectDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Closer {
	public static void closeConnection(ConnectDb conn) {
			try {conn.close();
			} catch (SQLException e) {
				e.printStackTrace();}
		}
		public static void closeStatement(Statement stmt) {
			try {stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public static void closeResultSet(ResultSet set) {
			try {
				set.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
