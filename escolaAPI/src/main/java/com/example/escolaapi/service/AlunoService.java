package com.example.escolaapi.service;

import com.example.escolaapi.model.Aluno;
import com.example.escolaapi.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno salvarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public boolean removerAluno(Long id) {
        if (alunoRepository.existsById(id)) {
            alunoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Optional<Aluno> atualizarAluno(Long id, Aluno novo) {
        return alunoRepository.findById(id).map(aluno -> {
            aluno.setNome(novo.getNome());
            aluno.setCurso(novo.getCurso());
            aluno.setIdade(novo.getIdade());
            return alunoRepository.save(aluno);
        });
    }
}
