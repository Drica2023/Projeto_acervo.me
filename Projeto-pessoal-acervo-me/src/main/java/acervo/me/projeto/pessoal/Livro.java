package acervo.me.projeto.pessoal;

import java.math.BigDecimal;

public class Livro {
    private BigDecimal id;
    private String titulo;
    private Autor autor;
    private Editora editora;
    private Idioma idiona;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Idioma getIdiona() {
        return idiona;
    }

    public void setIdiona(Idioma idiona) {
        this.idiona = idiona;
    }
}
