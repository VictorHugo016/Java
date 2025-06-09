package br.edu.fatecfranca.empresa.repository;

import br.edu.fatecfranca.empresa.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
