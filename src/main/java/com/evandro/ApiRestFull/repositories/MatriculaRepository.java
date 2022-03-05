package com.evandro.ApiRestFull.repositories;

import com.evandro.ApiRestFull.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Evandro
 */
@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{
    
}
