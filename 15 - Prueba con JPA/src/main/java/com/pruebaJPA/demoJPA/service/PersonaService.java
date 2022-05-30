

package com.pruebaJPA.demoJPA.service;

import com.pruebaJPA.demoJPA.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Caro
 */
@Service
public class PersonaService {
    
    @Autowired
    private IPersonaRepository persoRepository;
}
