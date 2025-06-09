package br.edu.fatecfranca.oficinamecanica.service;

import br.edu.fatecfranca.oficinamecanica.model.Cliente;
import br.edu.fatecfranca.oficinamecanica.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }
}
