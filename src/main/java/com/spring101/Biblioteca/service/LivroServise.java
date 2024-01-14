package com.spring101.Biblioteca.service;

import com.spring101.Biblioteca.dto.LivroDto;
import com.spring101.Biblioteca.entity.Livro;
import com.spring101.Biblioteca.exception.AutorNotFoundException;
import com.spring101.Biblioteca.exception.EditoraNotFoundException;
import com.spring101.Biblioteca.exception.LivroNotFoundException;
import com.spring101.Biblioteca.mapper.LivroMapper;
import com.spring101.Biblioteca.repository.AutorRepository;
import com.spring101.Biblioteca.repository.EditoraRepository;
import com.spring101.Biblioteca.repository.LivroRepository;
import com.spring101.Biblioteca.repository.models.AutorModel;
import com.spring101.Biblioteca.repository.models.EditoraModel;
import com.spring101.Biblioteca.repository.models.LivroModel;
import com.spring101.Biblioteca.request.LivroRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LivroServise {
    private final LivroRepository livroRepository;
    private final AutorRepository autorRepository;
    private final EditoraRepository editoraRepository;

    public LivroModel novoLivro(LivroRequest request) throws AutorNotFoundException, EditoraNotFoundException {
        AutorModel autor = getAutorByNome(request.getAutor());
        EditoraModel editora = getEditoraByNome(request.getEditora());
        List<AutorModel> autores = Collections.singletonList(autor);

        LivroModel model = LivroMapper.toLivroModel(request, autores );

        return livroRepository.save(model);
    }

    public List<LivroDto> getAllLivros() {
        List<LivroModel> livros = livroRepository.findAll();
        return livros.stream()
                .map(LivroMapper::toLivroDto)
                .collect(Collectors.toList());
    }

    public LivroDto getLivroById(Integer id) {
        LivroModel livro = getLivroModelById(id);
        return LivroMapper.toLivroDto(livro);
    }

    public LivroModel atualizarLivro(Integer id, LivroRequest request) throws AutorNotFoundException, EditoraNotFoundException {
        LivroModel livro = getLivroModelById(id);
        AutorModel autor = getAutorByNome(request.getAutor());
        EditoraModel editora = getEditoraByNome(request.getEditora());

        livro.setTitulo(request.getTitulo());
        livro.setIdioma(request.getIdioma());
        livro.setGeneroLiterario(request.getGeneroLiterario());
        livro.setResumo(request.getResumo());
        livro.setNumeroDePaginas(request.getNumeroDePaginas());

        return livroRepository.save(livro);
    }

    public void deletarLivro(Integer id) {
        LivroModel livro = getLivroModelById(id);
        livroRepository.delete(livro);
    }

    private AutorModel getAutorByNome(String autorNome) throws AutorNotFoundException {
        AutorModel autor = autorRepository.findByNome(autorNome);
        if (autor == null) {
            throw new AutorNotFoundException("Autor não encontrado: " + autorNome);
        }
        return autor;
    }

    private EditoraModel getEditoraByNome(String editoraNome) throws EditoraNotFoundException {
        EditoraModel editora = editoraRepository.findByNome(editoraNome);
        if (editora == null) {
            throw new EditoraNotFoundException("Editora não encontrada: " + editoraNome);
        }
        return editora;
    }

    private LivroModel getLivroModelById(Integer id) throws LivroNotFoundException {
        return livroRepository.findById(id)
                .orElseThrow(() -> new LivroNotFoundException("Livro não encontrado: " + id));
    }

}
