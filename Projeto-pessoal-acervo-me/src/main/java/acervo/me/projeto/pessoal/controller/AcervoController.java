package acervo.me.projeto.pessoal.controller;

import acervo.me.projeto.pessoal.DTOs.LivroRecordDto;
import acervo.me.projeto.pessoal.model.Livro;
import acervo.me.projeto.pessoal.repositories.AcervoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class AcervoController {
    @Autowired
    AcervoRepository acervorepository;

    @PostMapping("/livros")
    public ResponseEntity<Livro> CadastrarLivro (@RequestBody @Valid LivroRecordDto livroRecordDto) {
        var livro = new Livro();
        BeanUtils.copyProperties(livroRecordDto,livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(acervorepository.save(livro));



    }
    @GetMapping("/livros")
    public ResponseEntity<List<Livro>> BuscarTodosLivros(){
        return ResponseEntity.status(HttpStatus.OK).body(acervorepository.findAll());

    }

    @GetMapping("/livros/{id}")
    public ResponseEntity<Object> BuscarUmLivro(@PathVariable (value="id")UUID id){
        Optional<Livro> livro1 = acervorepository.findById(id);
        if (livro1.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body("Livro nao encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(livro1.get());

    }

    @PutMapping("/livros/{id}")
    public ResponseEntity<Object> AtualizarLivros(@PathVariable (value = "id") UUID id, @RequestBody @Valid LivroRecordDto livroRecordDto){
       Optional<Livro> livro1 = acervorepository.findById(id);
       if(livro1.isEmpty()){
           return ResponseEntity.status(HttpStatus.OK).body("Livro nao encontrado");
       }
       var Livro = livro1.get();
       BeanUtils.copyProperties(livroRecordDto,Livro);
       return ResponseEntity.status(HttpStatus.OK).body(acervorepository.save(Livro));
    }
@DeleteMapping ("livros/{id}")
    public ResponseEntity<Object> deletarLivro( @PathVariable (value="id") UUID id){
        Optional<Livro> livro1 = acervorepository.findById(id);
        if(livro1.isEmpty()){
            return ResponseEntity.status(HttpStatus.OK).body("Livro nao encontrado");
        }
        acervorepository.delete(livro1.get());
        return ResponseEntity.status(HttpStatus.OK).body("Livro" + livro1.get().toString() + "excluido com sucesso!");
}




}
