package br.com.TADS1N.Beans;

/**
 *
 * @author MelquiDba
 */
public class Imovel {
 
 private int id;
 private String Endereco;
 private String codigo;
 private double Area;
 private double Valor;
 private String Tipo;
 private Integer Quantidade_Comodo;
 
 public Imovel(){
     
 }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Integer getQuantidade_Comodo() {
        return Quantidade_Comodo;
    }

    public void setQuantidade_Comodo(Integer Quantidade_Comodo) {
        this.Quantidade_Comodo = Quantidade_Comodo;
    }
 
 
 
}
