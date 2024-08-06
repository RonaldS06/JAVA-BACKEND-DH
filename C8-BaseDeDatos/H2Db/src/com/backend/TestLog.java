package com.backend;
import com.backend.Model.Empleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestLog {
    public static void main(String[] args) {
        // Crear la conexión a la base de datos
        try {
            Class.forName("org.h2.Driver").newInstance();
            try (Connection con = DriverManager.getConnection("jdbc:h2:" + "./Database/my", "root", "myPassword");
                 Statement stmt = con.createStatement()) {

                // Crear la tabla EMPLEADO
                String createSql = "DROP TABLE IF EXISTS EMPLEADO;" +
                        "CREATE TABLE EMPLEADO(" +
                        "ID INT AUTO_INCREMENT PRIMARY KEY, " +
                        "NOMBRE VARCHAR(255), " +
                        "EDAD INT, " +
                        "EMPRESA VARCHAR(255), " +
                        "FECHA_INICIO VARCHAR(255));";
                stmt.execute(createSql);

                // Insertar filas en la tabla EMPLEADO
                String insertSql = "INSERT INTO EMPLEADO VALUES(1, 'Juan Perez', 30, 'Digital', '2021-01-10');" +
                        "INSERT INTO EMPLEADO VALUES(2, 'Ana Lopez', 25, 'Google', '2022-03-15');" +
                        "INSERT INTO EMPLEADO VALUES(3, 'Luis Gomez', 40, 'Facebook', '2020-05-20');";
                stmt.execute(insertSql);

                // Consultar y mostrar todos los registros de la tabla EMPLEADO
                String sql = "SELECT * FROM EMPLEADO";
                try (ResultSet rs = stmt.executeQuery(sql)) {
                    // Recorrer el resultado de la consulta
                    while (rs.next()) {
                        int id = rs.getInt("ID");
                        String nombre = rs.getString("NOMBRE");
                        int edad = rs.getInt("EDAD");
                        String empresa = rs.getString("EMPRESA");
                        String fechaInicio = rs.getString("FECHA_INICIO");

                        Empleado empleado = new Empleado(id, nombre, edad, empresa, fechaInicio);
                        System.out.println(empleado);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
