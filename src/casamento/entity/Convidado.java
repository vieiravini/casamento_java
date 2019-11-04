package casamento.entity;

import java.util.Scanner;

import casamento.database.Database;

public class Convidado {

	
	protected String nome;
	protected String familia;
	protected int mesa;
	protected boolean padrinho;
	protected String presente;
	protected String local_compra;
	
	public void listar() {
		
		
		Scanner input = new Scanner(System.in);
		Database.list();
		
		System.out.println("Digite 1 para sair");
		int opcao = input.nextInt();
		
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	public boolean isPadrinho() {
		return padrinho;
	}

	public void setPadrinho(boolean padrinho) {
		this.padrinho = padrinho;
	}

	public String getPresente() {
		return presente;
	}

	public void setPresente(String presente) {
		this.presente = presente;
	}

	public String getLocal_compra() {
		return local_compra;
	}

	public void setLocal_compra(String local_compra) {
		this.local_compra = local_compra;
	}
	
}
