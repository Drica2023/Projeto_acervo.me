# Projeto_acervo.me
Projeto Pessoal: acervo.me

### Projeto API REST local usando base de Dados MySql, Spring Boot 3, Java 17 

#### Diagrama de Classe do acervo.me
```mermaid
classDiagram
    class Livro {
        +titulo: String
        +idioma: String
        --
        +getTitulo(): String
        +getIdioma(): String
        +getAutor(): Autor
        +getEditora(): Editora
    }

    class Autor {
        +nome: String
        --
        +getNome(): String
        +listarLivros(): List<Livro>
    }

    class Editora {
        +nome: String
        +anoPublicacao: Int
        --
        +getNome(): String
        +getAnoPublicacao(): Int
    }

    %% Multiplicidades e relacionamentos
    Autor "1" --> "0..*" Livro : escreve >
    Livro "1" --> "1" Editora : publicado por >
```
