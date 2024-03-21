package com.escola.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(name = "/alunos")
public class AlunoController {

    @PostMapping
    public Aluno cadastrarAluo(@RequestBody Aluno aluno){
        return AlunoRepository.save(aluno);
    }

    @Autowired
    private AlunoRepository alunoRepository;
}
