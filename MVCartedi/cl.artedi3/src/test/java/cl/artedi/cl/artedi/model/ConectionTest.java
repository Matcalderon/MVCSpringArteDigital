package cl.artedi.cl.artedi.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ConectionTest {

    private static Connection connection;

    @BeforeClass
    public static void setUp() throws SQLException {
        // Configura la conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/artedi"; // Nombre de la tabla de base de datos
        String username = "root"; // Cambia el nombre de usuario según tu configuración
        String password = "12345"; // Cambia la contraseña según tu configuración

        // Abre la conexión
        connection = DriverManager.getConnection(url, username, password);
    }

    @AfterClass
    public static void tearDown() throws SQLException {
        // Cierra la conexión
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    @Test
    public void testConnection() throws SQLException {
        // Verifica que la conexión a la base de datos esté abierta y no sea nula
        assertNotNull(connection);
        assertFalse(connection.isClosed());
    }
}