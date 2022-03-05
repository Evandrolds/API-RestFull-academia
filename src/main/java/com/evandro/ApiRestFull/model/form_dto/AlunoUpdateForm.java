package com.evandro.ApiRestFull.model.form_dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Evandro
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoUpdateForm {
    private String nome;
    private String bairro;
    private String dataNascimento;
}
