package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelas {

	public static void main(String[] args) {
		System.out.println("teste");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		factory.close();
		System.out.println("teste2");
	}
}
