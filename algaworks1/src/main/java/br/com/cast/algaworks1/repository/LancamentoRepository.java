package br.com.cast.algaworks1.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.cast.algaworks1.model.Lancamento;

public class LancamentoRepository implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private EntityManager manager;
	
	public LancamentoRepository(EntityManager manager) {
		this.manager = manager;
	}
	
	@SuppressWarnings("unchecked")
	public List<Lancamento> buscaTodos(){
		Query query = manager.createQuery("from Lancamento");
		return query.getResultList();
	}
	
	
}	
