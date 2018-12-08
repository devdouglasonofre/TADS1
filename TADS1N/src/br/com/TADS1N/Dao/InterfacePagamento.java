package br.com.TADS1N.Dao;

import br.com.TADS1N.Beans.Cliente;
import br.com.TADS1N.Beans.Pagamento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MelquiDba
 */
public interface InterfacePagamento {
 
    
  public void cadastrar(Pagamento pagamento);    
  
    public List<Cliente> buscarCpf(String cpf) ;
    
     public ArrayList<Cliente> listartodos();
    
}
