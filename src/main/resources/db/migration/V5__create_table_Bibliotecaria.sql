CREATE TABLE Bibliotecaria (
  ID INT PRIMARY KEY,
  Nome VARCHAR(255),
  Idade INT,
  Endereco VARCHAR(255),
  Telefone VARCHAR(20),
  Cidade VARCHAR(255),
  Estado VARCHAR(255),
  Leitor_ID INT,
  FOREIGN KEY (Leitor_ID) REFERENCES Leitor(ID)
);