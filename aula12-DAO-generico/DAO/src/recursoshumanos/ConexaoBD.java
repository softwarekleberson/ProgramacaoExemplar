package recursoshumanos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    public static Connection getConexao() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/testeDao",
                "postgres",
                "VAISANTOS1");
    }

}
