package engComp;

import java.util.List;

import engComp.data.PessoaData;
import engComp.model.Pessoa;

public class App 
{
    public static void main( String[] args )
    {
        PessoaData pd = new PessoaData();
        List<Pessoa> pessoas = pd.GetPessoas();

        pessoas.forEach(p->{
            System.out.println(p);
        });
    }
}
