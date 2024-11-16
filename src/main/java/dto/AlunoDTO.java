package com.cursosonline.dto;

import lombok.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AlunoDTO {

    private Long id;
    private String nome;
    private String email;
}
