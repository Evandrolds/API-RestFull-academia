package com.evandro.ApiRestFull.controller;

import com.evandro.ApiRestFull.model.Aluno;
import com.evandro.ApiRestFull.model.Matricula;
import com.evandro.ApiRestFull.model.form_dto.MatriculaForm;
import com.evandro.ApiRestFull.repositories.MatriculaRepository;
import com.evandro.ApiRestFull.service.impl.MatriculaServiceImpl;
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
@RequestMapping("/matricula")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula createMatricula(@RequestBody MatriculaForm mat) {
        return service.createForm(mat);
    }
    @GetMapping("/{id}")
    public Matricula findById(@PathVariable Long id){
       return service.findById(id);
    }

    @PutMapping("/{id}")
    public Matricula updateMatricula(@RequestBody MatriculaForm mat, @PathVariable Long id) {
        service.findById(id);
        return service.createForm(mat);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        service.deleteById(id);
       return ResponseEntity.ok().body(id);
    }
}
