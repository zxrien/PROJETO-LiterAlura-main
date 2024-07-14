package br.com.felipe.literalura.repository;

import br.com.felipe.literalura.model.Autor;
import br.com.felipe.literalura.model.Livro;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface LivroRepository extends JpaRepository<Livro, Long> {

    Livro findByTitulo(String titulo);

    @Query("SELECT l FROM Livro l WHERE l.idioma LIKE %:idioma%")
    List<Livro> findLivrosPorIdioma(String idioma);

}
