package com.evandro.ApiRestFull.model.form_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Evandro
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alunoId;
}
