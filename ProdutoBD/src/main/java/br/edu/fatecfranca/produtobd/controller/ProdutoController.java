package br.edu.fatecfranca.produtobd.controller;

import br.edu.fatecfranca.produtobd.model.Produto;
import br.edu.fatecfranca.produtobd.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
    private ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Produto> listar(){
        return service.listaProdutos();
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto) {
        return service.salvarProduto(produto);
    }

        return service.removerProduto(id) ?
    }

        return service.atualizaProduto(id, novo);
    }
}
