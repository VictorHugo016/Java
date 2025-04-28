package br.edu.fatecfranca.produtolist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProductController {

    @GetMapping
    public String listaProdutos() {
        return "Aqui vou listar os produtos em memoria";

    }
}
