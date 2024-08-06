package com.backend;
import org.apache.log4j.Logger;
import java.sql.*;

public class Animal {
    private static final Logger LOGGER = Logger.getLogger(Animal.class);
    public static void main(String[] args) {
        Connection connection = null;
        try {
            //1-Establecemos la cnx
            connection = getConnection();
            //2-Ejecutar sentencias
            Statement statement = connection.createStatement();
            //⭐Crear tabla
            String createTable = "DROP TABLE IF EXISTS ANIMALES; CREATE TABLE ANIMALES(ID INT AUTO_INCREMENT PRIMARY KEY, NOMBRE VARCHAR(20) NOT NULL, TIPO VARCHAR(20) NOT NULL)";
            statement.execute(createTable);

            //⭐Insertar datos registro
            String insertData = "INSERT INTO ANIMALES(NOMBRE, TIPO) VALUES ('Firulais', 'Perro'), ('Lola', 'Vaca'), ('Homero', 'Perro'), ('Pepe', 'Sapo'), ('Tuki', 'Loro')";
            statement.execute(insertData);

            //⭐Ejecutar consultas a la Db
            String consultaSql = "SELECT * FROM ANIMALES";
            ResultSet resultSet = statement.executeQuery(consultaSql);

            //⭐Obtener resultados de la Db
            while (resultSet.next()){
                LOGGER.info("Animal: " + resultSet.getString("ID") + " - " + resultSet.getString(2) + " - " + resultSet.getString("tipo"));
            }

            LOGGER.info("--------------------------------------------------------------------");

            //⭐Eliminar un registro
            String deleteSql = "DELETE FROM ANIMALES WHERE ID = 1";
            statement.execute(deleteSql);
            resultSet = statement.executeQuery(consultaSql);
            while (resultSet.next()){
                LOGGER.info("Animal: " + resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString("tipo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error(e.getClass() + ": " + e.getMessage());
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                LOGGER.error(e.getMessage());
            }
        }
    }
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        //Indicar que driver vamos a usar para conectarnos
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:" + "./Database/my", "root", "myPassword");
    }
}

