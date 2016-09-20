package br.com.entity;

import java.util.List;

public class Funcionario {
	
	protected String nome;
	protected Double salario;
	
	public Funcionario(){
		
	}
	
	public Funcionario(String nome, Double salario){
		this.nome = nome;
		this.salario = salario;
		
	}
	
	public Integer totalFuncionarios(List<Funcionario> func){
		
		return func.size();
		
	}
	
	public Double bonifica(){
		return this.salario *0.10;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}



}
