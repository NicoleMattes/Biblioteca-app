CREATE TABLE Emprestimo (
  ID INT PRIMARY KEY,
  Leitor_ID INT,
  Bibliotecaria_ID INT,
  Livro1 INT,
  Livro2 INT,
  Livro3 INT,
  Livro4 INT,
  Livro5 INT,
  Data_Emprestimo DATE,
  Data_Limite_Devolucao DATE,
  Data_Devolucao DATE,
  Valor_Multa DECIMAL(10, 2),
  Data_Renovacao DATE,
  Observacoes TEXT,
  FOREIGN KEY (Leitor_ID) REFERENCES Leitor(ID),
  FOREIGN KEY (Bibliotecaria_ID) REFERENCES Bibliotecaria(ID),
  FOREIGN KEY (Livro1) REFERENCES LIVRO(Id),
  FOREIGN KEY (Livro2) REFERENCES LIVRO(Id),
  FOREIGN KEY (Livro3) REFERENCES LIVRO(Id),
  FOREIGN KEY (Livro4) REFERENCES LIVRO(Id),
  FOREIGN KEY (Livro5) REFERENCES LIVRO(Id)
);