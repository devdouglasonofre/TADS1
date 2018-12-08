package br.com.TADS1N.Dao;

import br.com.TADS1N.Beans.Cliente;
import br.com.TADS1N.Beans.Corretor;
import br.com.TADS1N.Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MelquiDba
 */
public class CorretorDao implements InterfaceCorretor {
 
   @Override
   public void cadastrar(Corretor corretor) {
        Connection conection = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        try {
            pst = conection.prepareStatement("insert into corretor (CRECI,NOME,TELEFONE,CIDADE,EMAIL )VALUES(?,?,?,?,?)");
            pst.setString(1, corretor.getCreci());
            pst.setString(2, corretor.getNome());
            pst.setString(3, corretor.getTelefone());
            pst.setString(4, corretor.getCidade());
            pst.setString(5, corretor.getEmail());

            pst.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO INSERIR DADOS DO CORRETOR" + ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(conection, pst);
        }

    }

   @Override
    public void alterar(Corretor corretor) {
        Connection conection = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        try {
            pst = conection.prepareStatement(" update corretor set CRECI=? , NOME=?, TELEFONE=?, CIDADE=?, EMAIL=? WHERE id=?");

             pst.setString(1, corretor.getCreci());
            pst.setString(2, corretor.getNome());
            pst.setString(3, corretor.getTelefone());
            pst.setString(4, corretor.getCidade());
            pst.setString(5, corretor.getEmail());
            pst.setInt(6, corretor.getCodigo_Corretor());

            pst.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR DADOS DO CORRETOR" + ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(conection, pst);
        }

    }

   @Override
    public void delete(Corretor corretor) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("delete from corretor where id=?");
            stmt.setInt(1, corretor.getCodigo_Corretor());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

   @Override
    public ArrayList<Corretor> listartodos() {
        Connection conection = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList listar = new ArrayList<>();
        try {
            pst = conection.prepareStatement("select * from corretor  ");
            rs = pst.executeQuery();

            while (rs.next()) {
                Corretor corretor = new Corretor();

                corretor.setCodigo_Corretor(rs.getInt("id"));
                corretor.setCreci(rs.getString("CRECI"));
                corretor.setNome(rs.getString("NOME"));
                corretor.setTelefone(rs.getString("TELEFONE"));
                corretor.setCidade(rs.getString("CIDADE"));
                corretor.setEmail(rs.getString("EMAIL"));
                listar.add(corretor);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao listar corretor " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conection, pst, rs);
        }
        return listar;
    }

   @Override
    public List<Corretor> PesquisarPorCreci(String creci) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Corretor> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM corretor WHERE CRECI LIKE?");
            stmt.setString(1, "%" + creci + "%");
            rs = stmt.executeQuery();

           while (rs.next()) {
                Corretor corretor = new Corretor();

                corretor.setCodigo_Corretor(rs.getInt("id"));
                corretor.setCreci(rs.getString("CRECI"));
                corretor.setNome(rs.getString("NOME"));
                corretor.setTelefone(rs.getString("TELEFONE"));
                corretor.setCidade(rs.getString("CIDADE"));
                corretor.setEmail(rs.getString("EMAIL"));
                lista.add(corretor);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os corretor " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }    
}
