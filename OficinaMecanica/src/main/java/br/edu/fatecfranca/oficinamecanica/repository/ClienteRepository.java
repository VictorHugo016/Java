package br.edu.fatecfranca.oficinamecanica.repository;

import br.edu.fatecfranca.oficinamecanica.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
