package acervo.me.projeto.pessoal.model;

import jakarta.persistence.*;


import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_LIVROS")
public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String titulo;

    private String autor;

    private String editora;

    private String anoPublicacao;
    @Enumerated(EnumType.STRING)
    private Idioma idioma;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "  {" +
                "titulo = " + titulo +
                '}';
    }
}
