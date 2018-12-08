package br.com.TADS1N.Dao;

import br.com.TADS1N.Beans.Corretor;
import br.com.TADS1N.Beans.Imovel;
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
public class ImovelDao   implements InterfaceImovel{

    @Override
    public void cadastrar(Imovel imovel) {
        Connection conection = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        try {
            pst = conection.prepareStatement("insert into imovel (endereco,Codigo,Area,Valor,Tipo,QuantComodos )VALUES(?,?,?,?,?,?)");
            pst.setString(1, imovel.getEndereco());
            pst.setString(2, imovel.getCodigo());
            pst.setDouble(3, imovel.getArea());
            pst.setDouble(4, imovel.getValor());
            pst.setString(5, imovel.getTipo());
            pst.setInt(6, imovel.getQuantidade_Comodo());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Imovel Inserido com Sucesso !", " Inserido ", 1);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO INSERIR DADOS DO IMOVEL" + ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(conection, pst);
        }

    }

    @Override
    public void alterar(Imovel imovel) {
        Connection conection = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        try {
            pst = conection.prepareStatement(" update imovel set Endereco=?, Codigo=?,AREA=?,VALOR=?,Tipo=?,QuantComodos=? where id=?");

            pst.setString(1, imovel.getEndereco());
            pst.setString(2, imovel.getCodigo());
            pst.setDouble(3, imovel.getArea());
            pst.setDouble(4, imovel.getValor());
            pst.setString(5, imovel.getTipo());
            pst.setInt(6, imovel.getQuantidade_Comodo());
            pst.setInt(7, imovel.getId());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Imovel Alterado com Sucesso !", " Alterado ", 1);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO ALTERAR DADOS DO IMOVEL" + ex.getMessage());

        } finally {
            ConnectionFactory.closeConnection(conection, pst);
        }

    }

    @Override
    public void delete(Imovel imovel) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("delete from imovel where id=?");
            stmt.setInt(1, imovel.getId());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir" + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    @Override
    public ArrayList<Imovel> listartodos() {
        Connection conection = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        ArrayList listar = new ArrayList<>();
        try {
            pst = conection.prepareStatement("select * from imovel  ");
            rs = pst.executeQuery();

            while (rs.next()) {
                Imovel imovel = new Imovel();

                imovel.setId(rs.getInt("id"));
                imovel.setEndereco(rs.getString("Endereco"));
                imovel.setCodigo(rs.getString("Codigo"));
                imovel.setArea(rs.getDouble("AREA"));
                imovel.setValor(rs.getDouble("VALOR"));
                imovel.setTipo(rs.getString("Tipo"));
                imovel.setQuantidade_Comodo(rs.getInt("QuantComodos"));

                listar.add(imovel);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro ao listar corretor " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(conection, pst, rs);
        }
        return listar;
    }

    @Override
    public List<Imovel> PesquisarPorCodigo(String codigo) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Imovel> lista = new ArrayList<>();

        Imovel imovel = new Imovel();

        try {
            stmt = con.prepareStatement("SELECT * FROM imovel WHERE Codigo LIKE?");
            stmt.setString(1, "%" + codigo + "%");
            rs = stmt.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Não foi Encontrado  " + " nenhum registro desse código : " + codigo);
            } else {

                imovel.setId(rs.getInt("id"));
                imovel.setEndereco(rs.getString("Endereco"));
                imovel.setCodigo(rs.getString("Codigo"));
                imovel.setArea(rs.getDouble("AREA"));
                imovel.setValor(rs.getDouble("VALOR"));
                imovel.setTipo(rs.getString("Tipo"));
                imovel.setQuantidade_Comodo(rs.getInt("QuantComodos"));
                lista.add(imovel);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os corretor " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return lista;
    }

}
