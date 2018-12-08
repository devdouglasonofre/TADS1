package br.com.TADS1N.Beans;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MelquiDba
 */
public class ImovelTableModel extends AbstractTableModel {

    /**
     * CorretorTableModel
     */
    private List<Imovel> imovel;

    public void setImovel(List<Imovel> imovel) {
        this.imovel = imovel;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "ID";
            case 1:
                return "ENDERECO";
            case 2:
                return "CODIGO";
            case 3:
                return "AREA";
            case 4:
                return "VALOR";
            case 5:
                return "TIPO";
            case 6:
                return "QTD COMODO";
            default:
                return null;
        }
    }

    @Override
    public int getRowCount() {
        return imovel != null
                ? imovel.size()
                : 0;
    }

//     public Corretor getRowValue(int l) {
//        return corretor.get(l);
//    }
    @Override
    public Object getValueAt(int lin, int col) {
        if (imovel != null && lin >= 0 && lin < imovel.size()) {
            Imovel imovel = this.imovel.get(lin);
            switch (col) {
                case 0:
                    return imovel.getId();
                case 1:
                    return imovel.getEndereco();
                case 2:
                    return imovel.getCodigo();
                case 3:
                    return imovel.getArea();
                case 4:
                    return imovel.getValor();
                case 5:
                    return imovel.getTipo();
                case 6:
                    return imovel.getQuantidade_Comodo();

            }
        }
        return null;
    }

}
