package br.com.entity;

public class Gerente extends Funcionario{
	
	
	@Override
	public Double bonifica() {
	  return this.salario * 0.15;
	}

}
