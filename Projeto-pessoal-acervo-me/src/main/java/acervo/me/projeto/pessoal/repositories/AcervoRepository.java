package acervo.me.projeto.pessoal.repositories;

import acervo.me.projeto.pessoal.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface AcervoRepository extends JpaRepository<Livro, UUID> {
}
