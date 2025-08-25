package domain.topico;


import domain.curso.Curso;
import domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name="topico")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    @Column(name="fecha_creacion")
    private LocalDateTime fechaCreacion;
    private Boolean status;
    @ManyToOne
    @JoinColumn(name="autor_id")
    private Usuario autor;
    @ManyToOne
    @JoinColumn(name="curso_id")
    private Curso curso;

}
