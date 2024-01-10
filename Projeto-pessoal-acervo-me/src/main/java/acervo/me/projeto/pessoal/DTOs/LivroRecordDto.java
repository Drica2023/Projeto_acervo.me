package acervo.me.projeto.pessoal.DTOs;

import acervo.me.projeto.pessoal.model.Idioma;
import jakarta.validation.constraints.NotBlank;


public record LivroRecordDto(@NotBlank String titulo, String autor ,String editora,  String anoPublicacao, Idioma idioma) {
}
