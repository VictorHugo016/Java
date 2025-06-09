package br.edu.fatecfranca.oficinamecanica.controller;

import br.edu.fatecfranca.oficinamecanica.model.OrdemServico;
import br.edu.fatecfranca.oficinamecanica.service.OrdemServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordens")
public class OrdemServicoController {
    @Autowired
    private OrdemServicoService ordemServicoService;

    @PostMapping
    public OrdemServico criar(@RequestBody OrdemServico ordemServico) {
        return ordemServicoService.salvar(ordemServico);
    }

    @GetMapping
    public List<OrdemServico> listar() {
        return ordemServicoService.listarTodos();
    }
}
