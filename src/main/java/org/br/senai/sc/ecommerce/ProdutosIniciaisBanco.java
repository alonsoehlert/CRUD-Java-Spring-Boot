package org.br.senai.sc.ecommerce;

import javax.transaction.Transactional;

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
	
	@Override
	public void run(String...args) throws Exception{
		
		Produto p1 = new Produto("Boné");
		p1.setCor("Azul");
		p1.setPreco(9.99);
		Produto p2 = new Produto("Caneca");
		p2.setCor("Laranja");
		p2.setPreco(15.25);
		
		produtoRepo.save(p1);
		produtoRepo.save(p2);
		
		
	}
	
	
	
	
}
