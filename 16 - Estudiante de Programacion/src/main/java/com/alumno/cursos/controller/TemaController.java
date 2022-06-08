package com.alumno.cursos.controller;

import com.alumno.cursos.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */
@RestController
public class TemaController {
    @Autowired
    ITemaRepository temaRepo;
}
