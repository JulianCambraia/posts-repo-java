package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date dataPostagem;
	private String titulo;
	private String conteudo;
	private Integer likes;

	private List<Comentario> comentarios = new ArrayList<Comentario>();

	public Post() {
		super();
	}

	public Post(Date dataPostagem, String titulo, String conteudo, Integer likes) {
		super();
		this.dataPostagem = dataPostagem;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public Date getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(Date dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void adicionarComentario(Comentario comentario) {
		comentarios.add(comentario);
	}

	public void removerComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}

}
