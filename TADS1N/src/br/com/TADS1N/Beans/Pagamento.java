package br.com.TADS1N.Beans;

/**
 *
 * @author MelquiDba
 */
public class Pagamento {
 
 private Cliente cliente;
 private Corretor corretor;
 private Imovel imovel;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
 
  
 
}
