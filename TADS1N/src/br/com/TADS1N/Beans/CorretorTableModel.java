package br.com.TADS1N.Beans;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Classe que define o modelo para tabela contendo dados do cliente
 *
 * @author Melquisedeque
 */
public class CorretorTableModel extends AbstractTableModel {

    /**
     *   CorretorTableModel
     */
    private List<Corretor> corretor;

    public void setCorretor(List<Corretor> corretor) {
        this.corretor = corretor;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "CODIGO";
            case 1:
                return "CRECI";
            case 2:
                return "NOME";
            case 3:
                return "TELEFONE";
            case 4:
                return "CIDADE";
            case 5:
            return "E-MAIL";
            default:
                return null;
        }
    }

    @Override
    public int getRowCount() {
        return corretor != null
                ? corretor.size()
                : 0;
    }
    
//     public Corretor getRowValue(int l) {
//        return corretor.get(l);
//    }

    @Override
    public Object getValueAt(int lin, int col) {
        if (corretor != null && lin >= 0 && lin < corretor.size()) {
            Corretor corretor = this.corretor.get(lin);
            switch (col) {
                case 0:
                    return corretor.getCodigo_Corretor();
                case 1:
                    return corretor.getCreci();
                case 2:
                    return corretor.getNome();
                case 3:
                    return corretor.getTelefone();
                case 4:
                    return corretor.getCidade();
                case 5:
                    return corretor.getEmail();

            }
        }
        return null;
    }
}
