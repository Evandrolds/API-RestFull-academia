package com.evandro.ApiRestFull.controller;

import com.evandro.ApiRestFull.model.Aluno;
import com.evandro.ApiRestFull.model.AvaliacaoFisica;
import com.evandro.ApiRestFull.model.form_dto.AlunoForm;
import com.evandro.ApiRestFull.model.form_dto.AlunoUpdateForm;
import com.evandro.ApiRestFull.repositories.AlunoRepository;
import com.evandro.ApiRestFull.service.impl.AlunoServiceImpl;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Evandro
 */
@RestController
@RequestMapping({"/alunos"})
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;
    @Autowired
    private AlunoRepository repository;

    @GetMapping
    public List findtAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Aluno findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Aluno create(@Valid@RequestBody AlunoForm form) {
        return service.createForm(form);
    }

    @PutMapping("/{id}")
    public ResponseEntity update(@Valid @PathVariable Long id, @RequestBody AlunoUpdateForm form) {
        return repository.findById(id).map(update -> {
            update.setNome(form.getNome());
            update.setBairro(form.getBairro());
            update.setDataNascimento(form.getDataNascimento());
            Aluno aluno = repository.save(update);
            return ResponseEntity.ok().body(aluno);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        return repository.findById(id).map(x -> {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/avaliacoes/{id}")
   public List<AvaliacaoFisica> getAllAvaliacoes(@PathVariable Long id){
       return service.findAllById(id);
   }
}
