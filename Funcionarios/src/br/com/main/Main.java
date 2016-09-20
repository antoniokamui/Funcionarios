package br.com.main;

import java.util.ArrayList;
import java.util.List;

import br.com.entity.Diretor;
import br.com.entity.Funcionario;
import br.com.entity.Gerente;

public class Main {

	public static void main(String[] args) {
		
		 List<Funcionario> lista = new ArrayList<>();
		
		 Funcionario funcionario = new Funcionario();
		 funcionario.setNome("Joao");
		 funcionario.setSalario(1000.0);
		 
		 lista.add(funcionario);
		 
		 System.out.println("nome: " + funcionario.getNome() + " salario: " + funcionario.getSalario() + " bonus:" + funcionario.bonifica());
		 
		 Gerente gerente = new Gerente();
		 gerente.setNome("Marcos");
		 gerente.setSalario(2000.0);
		 
		 lista.add(gerente);
		 
		 System.out.println("nome: " + gerente.getNome() + " salario: " + gerente.getSalario() + " bonus:" + gerente.bonifica());
		 
		 
		 Diretor diretor = new Diretor();
		 diretor.setNome("Pedro");
		 diretor.setSalario(5000.0);
		 
		 lista.add(diretor);
		 
		 System.out.println("nome: " + diretor.getNome() + " salario: " + diretor.getSalario() + " bonus:" + diretor.bonifica());
		 
		 System.out.println("Total de funcionarios: " + funcionario.totalFuncionarios(lista));
		 
			
	}

}
