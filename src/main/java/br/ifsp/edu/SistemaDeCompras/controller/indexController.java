package br.ifsp.edu.SistemaDeCompras.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.ifsp.edu.SistemaDeCompras.model.Venda;

@Controller
public class indexController {

	@GetMapping("/")
	public String getIndex() {
		return "index";
	}
	@PostMapping("/venda")
	public String venda (Venda venda, Model model) {
		System.out.println("VENDA");
		model.addAttribute("valorBruto", venda.getValorBruto());
		model.addAttribute("valorFinal", venda.getValorFinal());
		model.addAttribute("desconto", venda.getPercentualDesconto());
		model.addAttribute("classificacao", venda.getClassificacao());
		model.addAttribute("cliente", venda.getNomeCliente());
		model.addAttribute("produto", venda.getNomeProduto());
		return "index";
	}
}

