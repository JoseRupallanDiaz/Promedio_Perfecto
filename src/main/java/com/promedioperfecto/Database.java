package com.promedioperfecto;

import java.sql.*;

public class Database {

    Connection connection;
    Statement statement;

    public Database() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/promedioperfecto","root","");
        statement = connection.createStatement();
    }

    public void add(String tabla, String columna, String valor) throws SQLException {
        statement.execute("INSERT INTO "+tabla+" ("+columna+") VALUES ('"+valor+"');");
        System.out.println("Añadiendo "+valor+" en "+columna+"en la tabla "+tabla);
    }

    public ResultSet getTable(String tabla) throws SQLException {
        ResultSet resultset = statement.executeQuery("select * from "+tabla);
        System.out.println("Cargando tabla "+tabla);
        return resultset;
    }

    public ResultSet getById(String tabla, int id) throws SQLException {
        ResultSet resultset = statement.executeQuery("SELECT * FROM "+tabla+" WHERE ID = "+id);
        System.out.println(resultset.getString("nombre"));
        return resultset;
    }

    public void addSemestre(Alumno alumno) throws SQLException {
        statement.execute("INSERT INTO semestre SET idAlumno = (SELECT id FROM alumno WHERE nombre = '"+alumno.getNombre()+"')");
    }
}
