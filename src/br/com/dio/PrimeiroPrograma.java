package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Livro livro = new Livro();
		Gato gato = new Gato();
		System.out.println(gato);
		System.out.println(livro);
	}

}


class Livro {
	public String nome;
	public String editora;
}
