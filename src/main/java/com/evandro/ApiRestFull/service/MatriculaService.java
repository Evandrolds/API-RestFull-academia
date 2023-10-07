package com.evandro.ApiRestFull.service;

import com.evandro.ApiRestFull.model.Matricula;
import com.evandro.ApiRestFull.model.MatriculaForm;
import java.util.List;

/**
 *
 * @author Evandro
 */
public interface MatriculaService {

    Matricula createForm(MatriculaForm form);

    List<Matricula> findAll();

    Matricula findById(Long id);

    void deleteById(Long id);

}
