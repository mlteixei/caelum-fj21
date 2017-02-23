package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAltera {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setId(2L);
		contato.setNome("Caelum Novo");
		contato.setEmail("contatonovo@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj57");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		dao.altera(contato);
		dao.getLista();

	}

}
