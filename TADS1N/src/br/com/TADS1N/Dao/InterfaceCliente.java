package br.com.TADS1N.Dao;

import br.com.TADS1N.Beans.Cliente;
import java.util.ArrayList;

/**
 *
 * @author MelquiDba
 */
public interface InterfaceCliente {

 public void cadastrar(Cliente cli);
 
  public void alterar(Cliente cli);
  
  public void deletar(Cliente c) ;
  
  public ArrayList<Cliente> listartodos() ;
  
  public ArrayList<Cliente> Pesquisar(String cpf);
}
