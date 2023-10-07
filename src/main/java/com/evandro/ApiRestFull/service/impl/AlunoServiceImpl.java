package com.evandro.ApiRestFull.service.impl;

import com.evandro.ApiRestFull.model.Aluno;
import com.evandro.ApiRestFull.model.AvaliacaoFisica;
import com.evandro.ApiRestFull.model.form_dto.AlunoForm;
import com.evandro.ApiRestFull.model.form_dto.AlunoUpdateForm;
import com.evandro.ApiRestFull.repositories.AlunoRepository;
import com.evandro.ApiRestFull.service.AlunoService;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Evandro
 */
@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno createForm(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataNascimento(form.getDataNascimento());
        return repository.save(aluno);
    }

    @Override
    public List<Aluno> findAll() {
        return repository.findAll();
    }

    @Override
    public Aluno findById(Long id) {
        return repository.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Aluno updateFormById(AlunoUpdateForm form, Long id) {

        Aluno aluno = repository.getById(id);
        aluno.setNome(form.getNome());
        aluno.setBairro(form.getBairro());
        aluno.getDataNascimento();
        aluno.getCpf();
        return repository.save(aluno);
    }

    @Override
    public List<AvaliacaoFisica> findAllById(Long id) {
        Aluno aluno = repository.findById(id).get();
        return aluno.getAvaliacoes();
    }

}
