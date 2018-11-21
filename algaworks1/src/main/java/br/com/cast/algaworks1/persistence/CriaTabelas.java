package br.com.cast.algaworks1.persistence;

import javax.persistence.Persistence;

public class CriaTabelas {
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("puFinanceiro");
	}
	
}
