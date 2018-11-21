package br.com.cast.algaworks1.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlInputText;

import br.com.cast.algaworks1.model.Livro;

@ViewScoped
@ManagedBean(name = "livro")
public class LivrosBean {

	private List<Livro> livros;
	private Livro novoLivro;

	private HtmlInputText titulo;
	private HtmlInputText autor;

	public LivrosBean() {
		this.novoLivro = new Livro();
		this.livros = new ArrayList<>();

		this.livros.add(new Livro("test1", "autor1"));
		this.livros.add(new Livro("test2", "autor2"));
		this.livros.add(new Livro("test3", "autor3"));

	}

	public void adicionar() {
		this.livros.add(this.novoLivro);
		this.novoLivro = new Livro();
	}

	public void excluir(Livro livro) {
		this.livros.remove(livro);
	}

	public void alterar(Livro livro) {
		this.titulo.setValue(livro.getTitulo());
		this.autor.setValue(livro.getAutor());
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Livro getNovoLivro() {
		return novoLivro;
	}

	public void setNovoLivro(Livro novoLivro) {
		this.novoLivro = novoLivro;
	}

	public HtmlInputText getTitulo() {
		return titulo;
	}

	public void setTitulo(HtmlInputText titulo) {
		this.titulo = titulo;
	}

	public HtmlInputText getAutor() {
		return autor;
	}

	public void setAutor(HtmlInputText autor) {
		this.autor = autor;
	}

}
