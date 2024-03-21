<h1 align="center">Biblioteca App</h1>
<p align="center"><i>Repositório para versionamento e documentação do projeto durante o seu desenvolvimento</i></p>
<br>

- [Sobre o projeto](https://github.com/NicoleMattes/API-User/edit/main/README.md#sparkles-sobre-este-projeto)
- [Tecnologias Utilizadas](https://github.com/NicoleMattes/API-User/blob/main/README.md#space_invader-tecnologias-utilizadas)
- [Recursos Principais](https://github.com/NicoleMattes/API-User/blob/main/README.md#-recursos-principais)
- [Abrir e rodar o projeto](https://github.com/NicoleMattes/API-User/blob/main/README.md#%EF%B8%8F-abrir-e-rodar-o-projeto)
- [Contribuindo](https://github.com/NicoleMattes/API-User/blob/main/README.md#pencil2-contribuindo)
<br>


## :sparkles: Sobre este projeto 

<p> Bem-vindo ao repositório da Biblioteca App! Essa aplicação tem como objetivo simular um sistema simples de uma biblioteca permitindo fazer todo o gerenciamento de livros, autores, titulos, a aplicação oferece uma solução robusta uma biblioteca, feita totalmente em Java nativo sem nenhum framework e o banco de datos possui versionamento.</p>
<br>

## :space_invader: Tecnologias Utilizadas 

<p display="inline-block">
      <img align="center" alt="Nick-Java"  src= "https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white">
      <img align="center"  alt="Nick-mysql"  src= "https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white">
</p>
<br>
                                                                                                  
## 🔨 Recursos Principais: 

- `Cadastro editora` Metodo que permite cadastras as editoras através do console.
- `Cadastro de autores`  Metodo que permite cadastras as autores através do console.
- `Cadastro de titulos` Metodo que permite cadastras as titulos através do console, selecionando editra e autores já cadastrados.
- `Cadastro de usuario` Metodo que permite o cadastro de usuarios.
- `Exbir` Metodo que permite exibir todos os titulos, autores, editoras e usuarios.
- `Emprestimo` Permite fazer o emprestimo de livros por usuarios.
- `Devolução` Devolução de um livro emprestado.
- `Verificação` Verifica se o usuario tem itens emprestados.
- `Editar`Permite editar titulo, editora e livro.

<br></br>
Esta aplicação foi projetada com ênfase na segurança, implementando práticas como HTTPS, hashing de senhas e políticas de autorização. Sinta-se à vontade para explorar o código-fonte, contribuir com melhorias ou utilizar esta API como base para seus projetos. Qualquer feedback é bem-vindo!</p>
<br>
## 🛠️ Abrir e rodar o projeto 

### Pré-requisitos
Certifique-se de ter o seguinte instalado em sua máquina:
- [Java JDK 17](https://www.oracle.com/java/technologies/downloads/#java17)

### Configuração do Banco de Dados

- Abra o projeto na sua IDE favorita.
- No diretório src/main/resources, encontre o arquivo application.properties e configure as seguintes propriedades para conectar ao seu banco de dados local:
  
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco_de_dados
spring.datasource.username=sua_usuario
spring.datasource.password=sua_senha
```

### Como Rodar o Projeto

- Execute a classe que possui o metodo main 

<br>
  
## :pencil2: Contribuindo 

Se você quiser contribuir para este projeto, por favor, siga os passos abaixo:

- Crie um fork do projeto.
- Crie uma branch para a sua contribuição: `git checkout -b feature/nova-funcionalidade`.
- Faça as alterações desejadas.
- Faça o commit das suas alterações: `git commit -m 'Adiciona nova funcionalidade`.
- Faça o push para a sua branch: `git push origin feature/nova-funcionalidade`.
- Abra um pull request.
