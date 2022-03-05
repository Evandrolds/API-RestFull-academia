package com.evandro.ApiRestFull.service;

import com.evandro.ApiRestFull.model.Aluno;
import com.evandro.ApiRestFull.model.AvaliacaoFisica;
import com.evandro.ApiRestFull.model.form_dto.AlunoForm;
import com.evandro.ApiRestFull.model.form_dto.AlunoUpdateForm;
import java.util.List;

/**
 *
 * @author Evandro
 */
public interface AlunoService {
    Aluno createForm(AlunoForm form);
    List<Aluno> findAll();
    Aluno findById(Long id);
    void deleteById(Long id);
    Aluno updateFormById(AlunoUpdateForm form, Long id);
    List<AvaliacaoFisica> findAllById(Long id);
   
}
