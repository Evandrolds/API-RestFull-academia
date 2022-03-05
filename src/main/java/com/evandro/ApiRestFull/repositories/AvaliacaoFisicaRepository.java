package com.evandro.ApiRestFull.repositories;

import com.evandro.ApiRestFull.model.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Evandro
 */
@Repository
public interface AvaliacaoFisicaRepository  extends JpaRepository<AvaliacaoFisica, Long>{
    
}
