package com.evandro.ApiRestFull.controller;

import com.evandro.ApiRestFull.model.AvaliacaoFisica;
import com.evandro.ApiRestFull.model.form_dto.AvaliacaoFisicaForm;
import com.evandro.ApiRestFull.model.form_dto.AvaliacaoFisicaUpdateForm;
import com.evandro.ApiRestFull.repositories.AvaliacaoFisicaRepository;
import com.evandro.ApiRestFull.service.impl.AvaliacaoFisicaServiceImpl;
import java.util.List;
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
@RequestMapping({"/avaliacoes"})
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;
    @Autowired
    private AvaliacaoFisicaRepository repository;

    @GetMapping
    public List<AvaliacaoFisica> findAll() {
        return service.findAll();
    }

    @GetMapping(path = {"/{id}"})
    public AvaliacaoFisica findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public AvaliacaoFisica createform(@RequestBody AvaliacaoFisicaForm form) {
        return service.createForm(form);
    }

    @PutMapping
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm form) {
        return service.updateFormById(id, form);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        return repository.findById(id).map(mapper -> {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
