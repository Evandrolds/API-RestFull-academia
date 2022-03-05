package com.evandro.ApiRestFull.repositories;

import com.evandro.ApiRestFull.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Evandro
 */
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    
}
