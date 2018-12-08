package br.com.TADS1N.Dao;

import br.com.TADS1N.Beans.Cliente;
import br.com.TADS1N.Beans.Pagamento;
import br.com.TADS1N.Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MelquiDba
 */
public class PagamentoDao  implements  InterfacePagamento{

    @Override
    public void cadastrar(Pagamento pagamento) {
        Connection conection = ConnectionFactory.getConnection();
        PreparedStatement pst = null;

        try {
            String sql = "insert into pagamento (IDCLI, IDCOR,IDIMOVEL,DATAPAG) VALUES (?,?,?,?)";
            pst.setInt(1, pagamento.getCliente().getCodigo());
            pst.setInt(2, pagamento.getCorretor().getCodigo_Corretor());
            pst.setInt(3, pagamento.getImovel().getId());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "PAGAMENTO REALIZADO COM SUCESSO ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO AO INSERIR PAGAMENTO" + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conection, pst);
        }

    }

    @Override
    public List<Cliente> buscarCpf(String cpf) {
        Connection conection = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        List<Cliente> listar = new ArrayList<>();
        try {

            String sql = "select nome from cliente where cpf like ";
            pst.setString(1, "%" + cpf + "%");
            rs = pst.executeQuery();
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                
                cliente.setCpf(rs.getString("cpf"));
                listar.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PagamentoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listar;
    }
    
    @Override
    public ArrayList<Cliente> listartodos() {
        Connection conection = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList  listar = new ArrayList<>();
        try {
            pst = conection.prepareStatement("select * from cliente  ");
            rs = pst.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigo(rs.getInt("id"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEmail(rs.getString("email"));
               
                listar.add(cliente);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao listar cliente " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conection, pst, rs);
        }
        return listar;
    }
    
}
