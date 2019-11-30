package com.casamento.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@SuppressWarnings("serial")
public class Casamento implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private String tipo_convidado;
	
	private boolean padrinho;
	
	private boolean madrinha;
	
	private int mesa;
	
	@OneToOne
	private Presente presente;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo_convidado() {
		return tipo_convidado;
	}

	public void setTipo_convidado(String tipo_convidado) {
		this.tipo_convidado = tipo_convidado;
	}

	public boolean isPadrinho() {
		return padrinho;
	}

	public void setPadrinho(boolean padrinho) {
		this.padrinho = padrinho;
	}

	public boolean isMadrinha() {
		return madrinha;
	}

	public void setMadrinha(boolean madrinha) {
		this.madrinha = madrinha;
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	public Presente getPresente() {
		return presente;
	}

	public void setPresente(Presente presente) {
		this.presente = presente;
	}
	
}
