package agenda;

public class Contato {

    private String nome, telefone, email, observacao;
    private int tipo;
    private Contato proximo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Contato getProximo() {
        return this.proximo;
    }

    public void setProximo(Contato proximo) {
        this.proximo = proximo;
    }

    public Contato() {
    }

    public Contato(String nome, String telefone, int tipo, String email, String observacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.tipo = tipo;
        this.email = email;
        this.observacao = observacao;
    }
    
     @Override
    public String toString() {
        
        Contato primeiro =this;// armazena a cabeca
        Contato index = this.getProximo();//armazenar o elemento atual da lista a ser percorrida
        String res = ""; // vai ser o acumulo 
        
        res = "Contato{" + "nome= " + nome + ", telefone= " + telefone + ", tipo= " + tipo + ", email= " + email + ", observacao= " + observacao + "";
        
        while(primeiro != index ){
            res = res + ", proximo= \n Contato{" + "nome= " + index.getNome() + ", telefone=" + index.getTelefone() + ", tipo= " + index.getTipo() + ", email= " + index.getEmail() + ", observacao= " + index.getObservacao() + "";
            index = index.getProximo();
        }
        res+= " }";
        return res;
    }
    
}
