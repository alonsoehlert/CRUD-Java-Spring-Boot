package org.br.senai.sc.ecommerce;

import javax.transaction.Transactional;

import org.br.senai.sc.ecommerce.comercial.dominio.Departamento;
import org.br.senai.sc.ecommerce.comercial.dominio.DepartamentoRepositorio;
import org.br.senai.sc.ecommerce.comercial.dominio.Produto;
import org.br.senai.sc.ecommerce.comercial.dominio.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class ProdutosIniciaisBanco implements CommandLineRunner {
	
	@Autowired
	private ProdutoRepositorio produtoRepo;
	
	@Autowired
	private DepartamentoRepositorio departamentoRepo;
	
	@Override
	public void run(String...args) throws Exception{
		
		Departamento departamento1 = new Departamento("PRO", "Profissional");
		Departamento departamento2 = new Departamento("UTL", "Utilitários" );
		
		departamentoRepo.save(departamento1);
		departamentoRepo.save(departamento2);
		departamentoRepo.flush();
		
		Produto p1 = new Produto("Boné");
		p1.setCor("Azul");
		p1.setPreco(9.99);
		p1.setDepartamento(departamento1);
		
		
		Produto p2 = new Produto("Caneca");
		p2.setCor("Laranja");
		p2.setPreco(15.25);
		p2.setDepartamento(departamento2);
		
		produtoRepo.save(p1);
		produtoRepo.save(p2);
		
		
	}
	
	
	
	
}
