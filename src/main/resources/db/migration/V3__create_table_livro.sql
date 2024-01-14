CREATE TABLE LIVRO(
  Id INT PRIMARY KEY,
  Titulo VARCHAR(150),
  Resumo TEXT,
  numero_de_paginas INT,
  Idioma VARCHAR(50),
  genero_literario VARCHAR(100),
  livro_categoria VARCHAR(255),
  Autor_ID INT
);