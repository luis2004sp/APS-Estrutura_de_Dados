package agenda;

import java.util.Arrays;
import javax.swing.SpringLayout;

public class ListaCircular {

    private Contato cabeca;
    private Contato cauda;
    private int quantidade;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.quantidade = 0;
    }

    /**
     * Adiciona um contato(celular) na lista
     *
     * @param nome Nome que será atribuido no contato
     * @param telefone Telefone que será atribuido no contato
     * @param tipo Tipo que será atribuido no contato
     * @param email Email que será atribuido no contato
     * @param observacao Observação que será atribuido no contato
     */
    public void adiciona(String nome, String telefone, int tipo, String email, String observacao) {
        Contato novo = new Contato(nome, telefone, tipo, email, observacao);
        if (this.cabeca == null) {
            this.cabeca = novo;
            this.cauda = novo;
        } else {
            Contato temp = this.cauda;
            temp.setProximo(novo);
            this.cauda = novo;
        }
        this.cauda.setProximo(this.cabeca);
        this.quantidade++;
        System.out.println("ADICIONADO " + this.quantidade);
    }

    /**
     * Exibe no console os elementos da lista
     */
    public void imprime() {
        if (this.cabeca != null) {
            Contato c = this.cabeca;
            do {
                System.out.println(c.getNome());
                System.out.println(c.getEmail());
                System.out.println(c.getTipo());
                System.out.println(c.getTelefone());
                System.out.println(c.getObservacao());

                c = c.getProximo();
            } while (c != this.cabeca);
        }
    }

    /**
     * Remove um elemento da lista a partir de um telefone
     *
     * @param telefone Número de telefone que será buscado para remover
     */
    public void remove(String telefone) {
        if (this.cabeca != null && this.cabeca.getTelefone().equals(telefone)) {
            this.cabeca = this.cabeca.getProximo();
            this.cauda.setProximo(cabeca);

        } else {
            Contato anterior = null;
            Contato proximo = this.cabeca;
            while (proximo != null && !proximo.getTelefone().equals(telefone)) {
                anterior = proximo;
                proximo = proximo.getProximo();
            }
            if (proximo != null) {

                if (proximo.getProximo() == this.cabeca) {
                    this.cauda = anterior;
                }

                anterior.setProximo(proximo.getProximo());
            }
        }
        this.quantidade--;
        System.out.println("REMOVIDO COM SUCESSO");
    }

    /**
     * Somente retorna o primeiro elemento da lista
     *
     * @return Retorna o primeiro elemento da lista
     */
    public Contato getCabeca() {
        return this.cabeca;
    }

    /**
     * serve pra consultar um item especifico na lista usando seu numero como
     * indice
     *
     * @param posicao É o indicador da posicao do contato na lista
     * @return retorna o contato pedido
     *
     */
    public Contato busca(int posicao) {
        if (this.cabeca == null) {
            return null;
        } else {
            int x = 0;

            Contato proximo = this.cabeca;
            while (proximo != null) {

                if (x == posicao) {
                    return proximo;
                }

                proximo = proximo.getProximo();
                x++;
            }
        }
        return null;
    }

    
    /**
     * Retorna a quantidade de elementos atuais na lista
     * @return quantidade Quantidade de elementos atuais na lista
     */
    public int getQuantidade() {
        return this.quantidade;
    }

    /**
     * Organiza as celulas em ordem alfabética
     */
    public void organizaLista() {

        Contato atual = this.cabeca;
        Contato proximo = atual.getProximo();
        Contato anterior = this.cauda;

        for (int i = 0; i < this.quantidade; i++) {
            for (int j = 0; j < this.quantidade - 1; j++) {

                String[] nomes = new String[2];
                nomes[0] = atual.getNome();
                nomes[1] = atual.getProximo().getNome();
                Arrays.sort(nomes);

                if (atual == this.cabeca && nomes[0] != atual.getNome()) {

                    atual.setProximo(proximo.getProximo());
                    this.cabeca = proximo;
                    cabeca.setProximo(atual);
                    this.cauda.setProximo(this.cabeca);

                    anterior = this.cabeca;
                    atual = anterior.getProximo();
                    proximo = atual.getProximo();

                } else if (proximo == this.cauda && nomes[0] != atual.getNome()) {

                    atual.setProximo(proximo.getProximo());
                    proximo.setProximo(atual);
                    anterior.setProximo(proximo);
                    this.cauda = atual;

                } else if (atual.getNome() != nomes[0]) {

                    atual.setProximo(proximo.getProximo());
                    proximo.setProximo(atual);
                    anterior.setProximo(proximo);

                    anterior = proximo;
                    atual = atual;
                    proximo = atual.getProximo();

                } else if (atual.getNome() == nomes[0]) {
                    anterior = atual;
                    atual = proximo;
                    proximo = atual.getProximo();

                }

            }
            atual = this.cabeca;
            proximo = atual.getProximo();
            anterior = this.cauda;;
        }

    }

    
    @Override
    public String toString() {
        return "ListaCircular{" + "cabeca=" + cabeca + ",\n\n cauda=" + cauda + ", quantidade=" + quantidade + '}';
    }
}
