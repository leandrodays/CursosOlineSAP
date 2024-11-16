package com.cursosonline.dto;

import com.cursosonline.dto.*;
import com.cursosonline.entity.*;
import org.springframework.stereotype.Component;

public class Populator {

    public com.cursosonline.dto.AlunoDTO toAlunoDTO(Aluno aluno){
        return new com.cursosonline.dto.AlunoDTO(aluno.getId(), aluno.getNome(), aluno.getEmail());
    }

    public com.cursosonline.dto.CursoDTO toCursoDTO(Curso curso) {
        return new com.cursosonline.dto.CursoDTO(curso.getId(), curso.getNome(), curso.getDescricao());
    }
}
