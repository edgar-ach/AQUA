package com.agua.model;

import java.sql.*;

public class Conexion {
	private Connection cn=null;
	public void getConexion(){
		String url="jdbc:postgresql://localhost:5432/";
		try {
			Class.forName("org.postgresql.Driver");
			cn=DriverManager.getConnection(url,"postgres","Edgar27021993");
			if (cn!=null) {
				System.out.println("Conexion Exitosa");				
			}
		} catch (Exception e) {
			System.out.println("Conexion Erronea"+e);			
		}
	}
	public void cerrarConexion(){
		try {
			cn.close();			
			System.out.println("Conexion Cerrada");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	}
	public void method(){
	
	}
	public void other method(){
	
	}

}
