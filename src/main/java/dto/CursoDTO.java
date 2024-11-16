package com.cursosonline.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDTO {

    private Long id;
    private String nome;
    private String descricao;
}
