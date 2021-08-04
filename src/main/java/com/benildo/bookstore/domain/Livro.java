package com.benildo.bookstore.domain;

public class Livro {

	private Integer id;
	private String titulo;
	private String  nome_autor;
	
	
	private Categoria categooria;


	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Livro(Integer id, String titulo, String nome_autor, Categoria categooria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.nome_autor = nome_autor;
		this.categooria = categooria;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getNome_autor() {
		return nome_autor;
	}


	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}


	public Categoria getCategooria() {
		return categooria;
	}


	public void setCategooria(Categoria categooria) {
		this.categooria = categooria;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}