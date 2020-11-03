package engComp.bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    String usuario = "root";
    String senha = "porta9";
    String host = "localhost";
    String porta = "3306";
    String bd = "usjt_db_pessoas";

    public Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario, senha);
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}