package br.com.TADS1N.Beans;

/**
 *
 * @author MelquiDba
 */
public class Corretor {
 
 private int Codigo_Corretor;
 private String Creci;
 private String Nome ;
 private String Telefone;
 private String Cidade;
 private String Email;
 
 
 public  Corretor(){
     
 }

    public int getCodigo_Corretor() {
        return Codigo_Corretor;
    }

    public void setCodigo_Corretor(int Codigo_Corretor) {
        this.Codigo_Corretor = Codigo_Corretor;
    }

    public String getCreci() {
        return Creci;
    }

    public void setCreci(String Creci) {
        this.Creci = Creci;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
 
 
 
}
