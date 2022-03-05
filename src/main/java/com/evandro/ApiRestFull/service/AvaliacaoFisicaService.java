package com.evandro.ApiRestFull.service;

import com.evandro.ApiRestFull.model.AvaliacaoFisica;
import com.evandro.ApiRestFull.model.form_dto.AvaliacaoFisicaForm;
import com.evandro.ApiRestFull.model.form_dto.AvaliacaoFisicaUpdateForm;
import java.util.List;

/**
 *
 * @author Evandro
 */
public interface AvaliacaoFisicaService {
    AvaliacaoFisica createForm(AvaliacaoFisicaForm form);
    AvaliacaoFisica updateFormById( Long id,AvaliacaoFisicaUpdateForm form);
    void deleteById(Long id);
    AvaliacaoFisica findById(Long id);
    List<AvaliacaoFisica> findAll();
}
