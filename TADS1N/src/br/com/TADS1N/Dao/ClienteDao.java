package br.com.TADS1N.Dao;

import br.com.TADS1N.Beans.Cliente;
import br.com.TADS1N.Conexao.ConnectionFactory;
import br.com.TADS1N.Interface.IDAO;
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
public class ClienteDao implements InterfaceCliente {

    @Override
    public void cadastrar(Cliente cli) {
        Connection conection = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        try {
            pst = conection.prepareStatement("insert into cliente (cpf,nome,telefone,cidade,email )VALUES(?,?,?,?,?)");
            pst.setString(1, cli.getCpf());
            pst.setString(2, cli.getNome());
            pst.setString(3, cli.getTelefone());
            pst.setString(4, cli.getCidade());
            pst.setString(5, cli.getEmail());

            pst.executeUpdate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO INSERIR DADOS DO CLIENTE" + ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(conection, pst);
        }

    }

    @Override
    public void alterar(Cliente cli) {
        Connection conection = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        try {
            pst = conection.prepareStatement(" update cliente set CPF=? , NOME=?, TELEFONE=?, CIDADE=?, EMAIL=? WHERE id=?");

            pst.setString(1, cli.getCpf());
            pst.setString(2, cli.getNome());
            pst.setString(3, cli.getTelefone());
            pst.setString(4, cli.getCidade());
            pst.setString(5, cli.getEmail());
            pst.setInt(6, cli.getCodigo());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "ALTERADO COM  SUCESSO");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR DADOS DO CLIENTE" + ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(conection, pst);
        }

    }

    @Override
    public void deletar(Cliente c) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("delete from cliente where id=?");
            stmt.setInt(1, c.getCodigo());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    @Override
    public ArrayList<Cliente> listartodos() {
        Connection conection = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList listar = new ArrayList<>();
        try {
            pst = conection.prepareStatement("select * from cliente  ");
            rs = pst.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();

                cli.setCodigo(rs.getInt("id"));
                cli.setCpf(rs.getString("cpf"));
                cli.setNome(rs.getString("nome"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setCidade(rs.getString("cidade"));
                cli.setEmail(rs.getString("email"));
                listar.add(cli);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao listar cliente " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conection, pst, rs);
        }
        return listar;
    }

    @Override
    public ArrayList<Cliente> Pesquisar(String cpf) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE cpf LIKE?");
            stmt.setString(1, "%" + cpf + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();

                cli.setCodigo(rs.getInt("id"));
                cli.setCpf(rs.getString("cpf"));
                cli.setNome(rs.getString("nome"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setCidade(rs.getString("cidade"));
                cli.setEmail(rs.getString("email"));
                lista.add(cli);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os clientes: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }

    public Cliente PesquisarCP(String cpf) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cliente cliente = new Cliente();
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE cpf LIKE?");
            stmt.setString(1, "%" + cpf + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                cliente.setCodigo(rs.getInt("id"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEmail(rs.getString("email"));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os clientes: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return cliente;
    }

}
