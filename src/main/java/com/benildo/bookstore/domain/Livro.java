package com.benildo.bookstore.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Livro implements Serializable{
	
	private static final long SerialVersionUID=1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String  nome_autor;
	
	@ManyToOne
	@JoinColumn(name= "categoria_id")
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
