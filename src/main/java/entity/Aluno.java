package entity;


import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    @Temporal(TemporalType.DATE)
    private Date dataCadastro = new Date();

    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Inscricao> inscricoes = new ArrayList<>();
}
