package recursoshumanos;

import java.sql.SQLException;
import java.time.LocalDate;

public class RecursosHumanos {
    
    public static void main(String[] args) throws SQLException, SQLException, IllegalArgumentException, IllegalArgumentException, IllegalAccessException, IllegalAccessException, IllegalAccessException, IllegalAccessException {
        
        Funcionario f1 = new Funcionario("12345", 
                "012.345.678-90", 
                "João da Silva", 
                "Programar", 
                LocalDate.now());
        
        Cliente c1 = new Cliente("João da Silva");
        DAO dao = new DAO();
        //dao.salvar(f1);
        dao.salvar(c1);
        
    }
    
}
