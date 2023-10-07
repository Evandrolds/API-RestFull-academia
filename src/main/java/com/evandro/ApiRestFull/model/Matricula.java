package com.evandro.ApiRestFull.model;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
@Table(name = "tb_matricula")
public class Matricula {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "id_Matricula")
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Aluno aluno;
    @Column(name = "Data_matricula")
    private LocalDateTime dataMatricula = LocalDateTime.now();
}
