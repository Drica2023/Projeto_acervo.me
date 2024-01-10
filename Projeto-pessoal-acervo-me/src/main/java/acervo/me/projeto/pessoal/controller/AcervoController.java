package acervo.me.projeto.pessoal.controller;

import acervo.me.projeto.pessoal.DTOs.LivroRecordDto;
import acervo.me.projeto.pessoal.model.Livro;
import acervo.me.projeto.pessoal.repositories.AcervoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcervoController {
    @Autowired
    AcervoRepository acervorepository;

    @PostMapping("/livros")
    public ResponseEntity<Livro> saveProduct (@RequestBody @Valid LivroRecordDto livroRecordDto) {
        var livro = new Livro();
        BeanUtils.copyProperties(livroRecordDto,livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(acervorepository.save(livro));



    }

}
