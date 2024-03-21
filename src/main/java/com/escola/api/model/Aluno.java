package com.escola.api.model;

    @Data
    @NoArgsConstructor
    @AllArgsContructor
    @Entity(name = "alunos'")

public class Aluno {
    
    
        @id
        @GeneratedValue(strategy = GenerationType.INDENTITY)
        private long idAluno;
        
        @column(nullable = false, lenght = 50)
        private String nome;
    
        @column(nullable = false, lenght = 150)
        private String sobrenome;
    
        @column(nullable = false, unique = true)
        private String email;
        
        @JsonFormat(pattern = "dd/MM/yyy")
        private LocalDate dataNascimento;
    
    }
    


