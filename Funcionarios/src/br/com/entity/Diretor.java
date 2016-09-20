package br.com.entity;

public class Diretor extends Funcionario {
	
	
	
	@Override
	public Double bonifica() {
	  return this.salario * 0.20;
	}

}
