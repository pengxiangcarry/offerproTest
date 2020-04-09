package pro.Socket;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class sql {
	public static void main(String[] args) {
		Connection conn;
		Properties pro;
		try {
			pro=new Properties();
			FileInputStream file=new FileInputStream("db.properties");
			pro.load(file);
			Class.forName("");
			
			
			DriverManager.getConnection(pro.getProperty("url"), pro.getProperty(""), pro.getProperty(""));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
