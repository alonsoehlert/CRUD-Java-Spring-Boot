package org.br.senai.sc.ecommerce.comercial.controle;

import javax.validation.Valid;

import org.br.senai.sc.ecommerce.comercial.dominio.Produto;
import org.br.senai.sc.ecommerce.comercial.dominio.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ProdutoControle {
		
		@Autowired
		private ProdutoRepositorio produtoRepo;
	
	
		@GetMapping("/comercial/produtos")
		public String produtos(Model model) {
			model.addAttribute("listaProdutos", produtoRepo.findAll());
			return "comercial/produtos/index";
		}

		@GetMapping("/comercial/produtos/novo")
		public String novoProduto(@ModelAttribute("produto") Produto produto) {
			return "comercial/produtos/form";
		}
		
		@GetMapping("/comercial/produtos/{id}")
		public String alterarProduto(@PathVariable("id") long id, Model model) {
			java.util.Optional<Produto> produtoOpt = produtoRepo.findById(id);
			if (!produtoOpt.isPresent()) {
				throw new IllegalArgumentException("Produto inválido!");
			}
			model.addAttribute("produto", produtoOpt.get());
			return "comercial/produtos/form";
		}
		
		@PostMapping("/comercial/produtos/salvar")
		public String salvarProduto(@Valid @ModelAttribute("produto") Produto produto, BindingResult bindingResult) {
			
			if(bindingResult.hasErrors()) {
				return "comercial/produtos/form";
			}
			
			
			produtoRepo.save(produto);
			return "redirect:/comercial/produtos";
		}
		
		@GetMapping("/comercial/produtos/excluir/{id}")
		public String excluirProduto(@PathVariable("id") long id) {
			java.util.Optional<Produto> produtoOpt = produtoRepo.findById(id);
			if (!produtoOpt.isPresent()) {
				throw new IllegalArgumentException("Produto inválido!");
			}
			
			produtoRepo.delete(produtoOpt.get());
			return "redirect:/comercial/produtos";
		}
}
