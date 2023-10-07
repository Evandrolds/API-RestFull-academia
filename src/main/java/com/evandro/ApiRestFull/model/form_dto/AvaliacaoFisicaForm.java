package com.evandro.ApiRestFull.model.form_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Evandro
 */
@Data
public class AvaliacaoFisicaForm {
    private Long alunoId;
    private Double peso;
    private Double altura;
}
