package com.evandro.ApiRestFull.service.impl;

import com.evandro.ApiRestFull.model.Matricula;
import com.evandro.ApiRestFull.model.MatriculaForm;
import com.evandro.ApiRestFull.repositories.MatriculaRepository;
import com.evandro.ApiRestFull.service.MatriculaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Evandro
 */
@Service
public class MatriculaServiceImpl implements MatriculaService {

    @Autowired
    private MatriculaRepository reposiroty;

    @Override
    public Matricula createForm(MatriculaForm form) {

        Matricula mat = new Matricula();
        mat.setId(form.getAlunoId());
        mat.getDataMatricula();
        return reposiroty.save(mat);
    }

    @Override
    public List<Matricula> findAll() {
        return reposiroty.findAll();
    }

    @Override
    public Matricula findById(Long id) {
        Optional<Matricula> mat = reposiroty.findById(id);
        return mat.get();
    }

    @Override
    public void deleteById(Long id) {
        reposiroty.deleteById(id);
    }

}
