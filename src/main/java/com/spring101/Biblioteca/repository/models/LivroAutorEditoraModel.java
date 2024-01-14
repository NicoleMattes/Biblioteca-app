    package com.spring101.Biblioteca.repository.models;

    import jakarta.persistence.*;
    import lombok.*;

    @Entity(name = "Autor_Livro_Editora")
    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public class LivroAutorEditoraModel {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        @ManyToOne
        @JoinColumn(name = "Autor_ID")
        private AutorModel autor;

        @ManyToOne
        @JoinColumn(name = "Livro_ID")
        private LivroModel livro;

        @ManyToOne
        @JoinColumn(name = "Editora_ID")
        private EditoraModel editora;
    }
