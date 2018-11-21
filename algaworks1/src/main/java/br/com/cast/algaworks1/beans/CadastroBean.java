package br.com.cast.algaworks1.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ViewScoped
@ManagedBean(name = "cad")
public class CadastroBean {

	private String nome;
	
	public void cadastrar() {
		FacesContext context = FacesContext.getCurrentInstance();
		
		FacesMessage message = new FacesMessage(
				FacesMessage.SEVERITY_ERROR, 
				"cadastro efetuado",
				"Cliente " + this.nome + " cadastrado com sucesso.");
		context.addMessage(null, message);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
