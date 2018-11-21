package br.com.cast.algaworks1.persistence;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.cast.algaworks1.model.Lancamento;
import br.com.cast.algaworks1.model.Pessoa;
import br.com.cast.algaworks1.model.TipoLancamento;
import br.com.cast.algaworks1.util.JpaUtil;

public class CriaLancamento {
	
	public static void main(String[] args) {
		
		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Calendar dataVenc1 = Calendar.getInstance();
		dataVenc1.set(2013,10,1,0,0,0);
		
		Calendar dataVenc2 = Calendar.getInstance();
		dataVenc2.set(2013,12,10,0,0,0);
		
		Pessoa cliente = new Pessoa();
		cliente.setNome("WWW Industria de alimentos");
		
		Pessoa fornecedor = new Pessoa();
		fornecedor.setNome("SoftBRAX Treinamentos");
		
		Lancamento l1 = new Lancamento();
		l1.setDescricao("Venda de licenca de software");
		l1.setPessoa(cliente);
		l1.setDataVencimento(dataVenc1.getTime());
		l1.setDataPagamento(dataVenc1.getTime());
		l1.setValor(new BigDecimal(103_000));
		l1.setTipo(TipoLancamento.RECEITA);
		
		Lancamento l2 = new Lancamento();
		l2.setDescricao("Venda de suporte anual");
		l2.setPessoa(cliente);
		l2.setDataVencimento(dataVenc1.getTime());
		l2.setDataPagamento(dataVenc1.getTime());
		l2.setValor(new BigDecimal(15_000));
		l2.setTipo(TipoLancamento.RECEITA);
		
		Lancamento l3 = new Lancamento();
		l3.setDescricao("Treinamento da equipe");
		l3.setPessoa(fornecedor);
		l3.setDataVencimento(dataVenc2.getTime());
		l3.setDataPagamento(dataVenc2.getTime());
		l3.setValor(new BigDecimal(68_000));
		l3.setTipo(TipoLancamento.DESPESA);
		
		em.persist(cliente);
		em.persist(fornecedor);
		em.persist(l1);
		em.persist(l2);
		em.persist(l3);
		
		et.commit();
		em.close();
		
	}
	
}
