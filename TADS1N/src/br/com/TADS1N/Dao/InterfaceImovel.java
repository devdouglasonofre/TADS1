/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.TADS1N.Dao;

import br.com.TADS1N.Beans.Imovel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MelquiDba
 */
public interface InterfaceImovel {

    public void cadastrar(Imovel imovel);

    /**
     * Método que inseri os dados na tabela de Imovel
     *
     * @param Imovel - recebe o objeto ImovelBeans
     * @throws java.lang.Exception se não for possível atualizar
     */

    public void alterar(Imovel imovel);

    /**
     * Método que atualiza os dados na tabela corretor
     *
     * @param Imovel - recebe o objeto ImovelBeans
     * @throws java.lang.Exception se não for possível atualizar
     */
    
    public void delete(Imovel imovel);

    /**
     * Método que excluir os dados na tabela de Imovel
     *
     *
     * @param Imovel - recebe o objeto ImovelBeans
     * @throws java.lang.Exception se não for possível atualizar
     */
    
     public ArrayList<Imovel> listartodos();
     
     
    /**
     * Método que lista todos os dados na tabela Imovel
     *
     * @param Imovel - recebe o objeto ImovelBeans
     * @throws java.lang.Exception se não for possível atualizar
     */
     
     public List<Imovel> PesquisarPorCodigo(String codigo) ;
}
