package br.edu.fatecfranca.empresa.repository;

import br.edu.fatecfranca.empresa.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
