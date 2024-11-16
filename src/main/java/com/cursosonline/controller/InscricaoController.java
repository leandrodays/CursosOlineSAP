package com.cursosonline.controller;

import com.cursosonline.entity.*;
import com.cursosonline.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/inscricoes")
@RequiredArgsConstructor
public class InscricaoController {
    private final InscricaoRepository inscricaoRepository;
    private final AlunoRepository alunoRepository;
    private final CursoRepository cursoRepository;

    @PostMapping
    public String inscrever(@RequestParam Long alunoId, @RequestParam Long cursoId) {
        Aluno aluno = alunoRepository.findById(alunoId).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        Curso curso = cursoRepository.findById(cursoId).orElseThrow(() -> new RuntimeException("Curso não encontrado"));

        Inscricao inscricao = new Inscricao(null, aluno, curso, new Date());
        inscricaoRepository.save(inscricao);
        return "Cadastro realizado com sucesso!";
    }
}
