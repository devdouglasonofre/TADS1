package br.com.TADS1N.Controller;

import br.com.TADS1N.Beans.Cliente;
import br.com.TADS1N.Dao.ClienteDao;
import java.util.ArrayList;

/**
 *
 * @author MelquiDba
 */
public class ControleCliente {
    ClienteDao clienteD = new  ClienteDao();
  
    public Cliente ControlerConsultarCpf(String cpf){
        return  this.clienteD.PesquisarCP(cpf);
    }
}
