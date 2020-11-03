package engComp.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import engComp.bd.Database;
import engComp.model.Pessoa;

public class PessoaData {
    private Connection c;
    private Database db = new Database();

    public PessoaData() {
        c = db.obtemConexao();
    }

    public List<Pessoa> GetPessoas() {
        String sql = "SELECT * FROM tb_pessoa";
        List<Pessoa> ret = new ArrayList<Pessoa>();

        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet res = ps.executeQuery();

            while(res.next()){
                Pessoa p = new Pessoa(
                    res.getInt("codigo"),
                    res.getString("nome"),
                    res.getString("fone"),
                    res.getString("email")
                );

                ret.add(p);
            }
            
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                c.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        
        return ret;
    }
}
