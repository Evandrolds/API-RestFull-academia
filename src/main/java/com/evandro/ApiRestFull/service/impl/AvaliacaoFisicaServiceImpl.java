package com.evandro.ApiRestFull.service.impl;

import com.evandro.ApiRestFull.model.Aluno;
import com.evandro.ApiRestFull.model.AvaliacaoFisica;
import com.evandro.ApiRestFull.model.form_dto.AvaliacaoFisicaForm;
import com.evandro.ApiRestFull.model.form_dto.AvaliacaoFisicaUpdateForm;
import com.evandro.ApiRestFull.repositories.AlunoRepository;
import com.evandro.ApiRestFull.repositories.AvaliacaoFisicaRepository;
import com.evandro.ApiRestFull.service.AvaliacaoFisicaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Evandro
 */
@Service
public class AvaliacaoFisicaServiceImpl implements AvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository repository;
    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica createForm(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avalicao = new AvaliacaoFisica();
        avalicao.setPeso(form.getPeso());
        avalicao.setAltura(form.getAltura());
        Aluno a = alunoRepository.findById(form.getAlunoId()).get();
        avalicao.setAluno(a);
        return repository.save(avalicao);
    }

    @Override
    public AvaliacaoFisica updateFormById(Long id, AvaliacaoFisicaUpdateForm form) {
        AvaliacaoFisica fisica = new AvaliacaoFisica();
        fisica.setAltura(form.getAltura());
        fisica.setPeso(form.getPeso());
        return repository.save(fisica);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public AvaliacaoFisica findById(Long id) {
        Optional<AvaliacaoFisica> avaliacao = repository.findById(id);
        return avaliacao.get();
    }

    @Override
    public List<AvaliacaoFisica> findAll() {
        return repository.findAll();
    }

}
