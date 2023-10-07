package com.evandro.ApiRestFull.model.form_dto;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

/**
 *
 * @author Evandro
 */
@Data
public class AlunoForm {

    @NotBlank(message = "Preencha o campo corretamente!")
    @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres !")
    private String nome;

    @NotEmpty(message = "Preencha o campo corretamente!")
    @CPF( message = "O CPF de numero '${validatedValue}' é inválido!")
    private String cpf;
    @NotEmpty(message = "Preencha o campo corretamente!")
    @Size(min = 5, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres !")
    private String bairro;
    @NotNull(message = "Preencha o campo corretamente!")
    // Aqui eu usei o Past porque a data tem que ser no passado, Past = passado
    @NotBlank(message = " A data '${validatedValue}' não é válida")
    private String dataNascimento;
}
