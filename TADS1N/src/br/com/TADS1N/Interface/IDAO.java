package br.com.TADS1N.Interface;

import java.util.ArrayList;

/**
 * Interface  para classe de  Acesso a dados
 * @author MelquiDba
 */
public interface IDAO<Tipo> {

    public void cadastrar(Tipo objeto);

    public void alterar(Tipo objeto);

    public void deletar(Tipo objeto);

    public ArrayList<Tipo> listartodos();

     public ArrayList<Tipo> Pesquisar(Tipo objeto);
}
