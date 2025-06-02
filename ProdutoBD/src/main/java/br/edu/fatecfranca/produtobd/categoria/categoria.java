package br.edu.fatecfranca.produtobd.categoria;
import br.edu.fatecfranca.produtobd.model.Produto;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos;

    public Categoria(){
        produtos = new ArrayList<Produto>();
    }

    public categoria(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
