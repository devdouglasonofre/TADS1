package br.com.TADS1N.Dao;

import br.com.TADS1N.Beans.Corretor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MelquiDba
 */
public interface InterfaceCorretor {

    public void cadastrar(Corretor corretor);

    /**
     * Método que inseri os dados na tabela corretor
     *
     * @param corretor - recebe o objeto CorretorBeans
     * @throws java.lang.Exception se não for possível atualizar
     */
    public void alterar(Corretor corretor);

    /**
     * Método que atualiza os dados na tabela corretor
     *
     * @param corretor - recebe o objeto CorretorBeans
     * @throws java.lang.Exception se não for possível atualizar
     */
    public void delete(Corretor corretor);

    /**
     * Método que excluir os dados na tabela corretor
     *
     * @param corretor - recebe o objeto CorretorBeans
     * @throws java.lang.Exception se não for possível atualizar
     */
    public ArrayList<Corretor> listartodos();

    /**
     * Método que lista todos os dados na tabela corretor
     *
     * @param corretor - recebe o objeto CorretorBeans
     * @throws java.lang.Exception se não for possível atualizar
     */
    public List<Corretor> PesquisarPorCreci(String creci);
    /**
     * Método que consulta o corretor através do seu creci
     *
     * @param corretor - recebe o objeto CorretorBeans
     * @throws java.lang.Exception se não for possível atualizar
     */
}
