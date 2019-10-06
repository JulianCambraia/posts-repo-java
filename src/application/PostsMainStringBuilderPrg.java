package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comentario;
import entities.Post;

public class PostsMainStringBuilderPrg {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario coments1 = new Comentario("Tenha uma boa viajem!");
		Comentario coments2 = new Comentario("Oh! que maravilhoso!");
		
		Date dataPost = sdf.parse("21/06/2019 13:05:44");
		String titulo = "Viajando para a Nova Zelandia";
		String conteudo = "Estou indo visitar este país maravilhoso!";
		String likes = "12"; 
		Post post = new Post(dataPost, titulo, conteudo, Integer.parseInt(likes));
		post.adicionarComentario(coments1);
		post.adicionarComentario(coments2);
		
		System.out.println(post); 
	}
}
