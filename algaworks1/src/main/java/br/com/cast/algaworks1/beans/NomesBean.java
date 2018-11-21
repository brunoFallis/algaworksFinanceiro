package br.com.cast.algaworks1.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

@ViewScoped
@ManagedBean(name = "nome")
public class NomesBean {

	private String nome;
	private List<String> nomes = new ArrayList<>();
	private String timeFavorito;
	private String[] timesFavoritos;

	private HtmlInputText inputName;
	private HtmlCommandButton buttonAdd;

	public void adicionar() {
		this.nomes.add(nome);

		this.inputName.setValue("");

		/*
		 * if (this.nomes.size() > 3) { this.inputName.setDisabled(true);
		 * this.buttonAdd.setDisabled(true);
		 * this.buttonAdd.setValue("mais de 4 adicionados"); }
		 */
	}
	
	public void pegaFilme() {
		System.out.println(this.getTimeFavorito());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getNomes() {
		return nomes;
	}

	public HtmlInputText getInputName() {
		return inputName;
	}

	public void setInputName(HtmlInputText inputName) {
		this.inputName = inputName;
	}

	public HtmlCommandButton getButtonAdd() {
		return buttonAdd;
	}

	public void setButtonAdd(HtmlCommandButton buttonAdd) {
		this.buttonAdd = buttonAdd;
	}

	public String getTimeFavorito() {
		return timeFavorito;
	}

	public void setTimeFavorito(String timeFavorito) {
		this.timeFavorito = timeFavorito;
	}

	public String[] getTimesFavoritos() {
		return timesFavoritos;
	}

	
	public void setTimesFavoritos(String[] timesFavoritos) {
		this.timesFavoritos = timesFavoritos;
	}

}
