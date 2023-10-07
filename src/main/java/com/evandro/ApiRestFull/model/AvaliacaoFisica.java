package com.evandro.ApiRestFull.model;


import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Evandro
 */
@Entity
@Data
@Table(name = "tb_avaliacao")
public class AvaliacaoFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Avaliacao")
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
    @Column(name = "Altura")
    private Double altura;
    @Column(name = "Peso")
    private Double peso;
    @Column(name = "Data_Avaliacao")
    
    private LocalDateTime dataAvaliacao = LocalDateTime.now().withHour(6);
}
