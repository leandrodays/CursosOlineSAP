package entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    @Temporal(TemporalType.DATE)
    private Date dataCriacao = new Date();

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private Liste<Inscricao> inscricoes = new ArrayList<>();


}
