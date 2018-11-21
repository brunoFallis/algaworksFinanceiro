package br.com.cast.algaworks1.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.cast.algaworks1.model.Lancamento;
import br.com.cast.algaworks1.repository.LancamentoRepository;
import br.com.cast.algaworks1.util.JpaUtil;

@ManagedBean(name = "lanc")
@ViewScoped
public class ConsultaLancamentosBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Lancamento> lancamentos;

	public void consultar() {
		EntityManager em = JpaUtil.getEntityManager();
		LancamentoRepository lr = new LancamentoRepository(em);
		
		this.lancamentos = lr.buscaTodos();

		em.close();
	}

	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}

}
