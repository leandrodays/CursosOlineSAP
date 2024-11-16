package com.cursosonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cursosonline.entity.*;
import java.util.*;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {}
interface CursoRepository extends JpaRepository<Curso, Long> {}
interface InscricaoRepository extends JpaRepository<Inscricao, Long> {
    List<Inscricao> findByAlunoId(Long alunoId);
    List<Inscricao> findByCursoId(Long cursoId);
}
