package br.edu.fatecfranca.produtobd;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String nome;
    private float preco;
    private int qtde;

    public Produto() {

    }

    public Produto(long id, String nome, float preco, int qtde) {
        Id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public long getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQtde() {
        return qtde;
    }

    public void setId(long id) {
        Id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }


}
