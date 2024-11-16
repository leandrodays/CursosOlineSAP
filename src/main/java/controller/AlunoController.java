package com.cursosonline.controller;

import com.cursosonline.dto.*;
import com.cursosonline.entity.*;
import com.cursosonline.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor


public class AlunoController {
    private final AlunoRepository alunoRepository;
    @PostMapping
    public com.cursosonline.dto.AlunoDTO cadastrar(@RequestBody com.cursosonline.dto.AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno(null, alunoDTO.getNome(), alunoDTO.getEmail(), new Date(), null);
        aluno = alunoRepository.save(aluno);
        return new com.cursosonline.dto.AlunoDTO(aluno.getId(), aluno.getNome(), aluno.getEmail());

    }
}
