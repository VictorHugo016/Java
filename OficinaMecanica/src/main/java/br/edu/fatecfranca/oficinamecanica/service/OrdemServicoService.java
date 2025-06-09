package br.edu.fatecfranca.oficinamecanica.service;

import br.edu.fatecfranca.oficinamecanica.model.OrdemServico;
import br.edu.fatecfranca.oficinamecanica.repository.OrdemServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdemServicoService {
    @Autowired
    private OrdemServicoRepository ordemServicoRepository;

    public OrdemServico salvar(OrdemServico ordemServico) {
        return ordemServicoRepository.save(ordemServico);
    }

    public List<OrdemServico> listarTodos() {
        return null;
    }
}

