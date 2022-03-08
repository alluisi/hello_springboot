package br.com.isidrocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.hello.model.Produto;

// @RestController = informo ao Spring que a minha classe é uma classe que atende requisições WEB
// através de URLs
@RestController
public class HelloController {

	
	// qual é a URL e qual método HTTP ela atende?
	@GetMapping("/teste")
	public String sayHello() {
		return "Hello World!!!";
	}
	
	
	@GetMapping("/testehtml")
	public String sayHelloEmHtml() {
		return "<html>"
				+ "  <head>"
				+ "    <title> .: teste de pagina :. </title>"
				+ "  </head>"
				+ "  <body>"
				+ "     <h1> Exemplo de Pagina HTML gerada dinamicamente </h1>"
				+ "     <hr>"
				+ "     <p>O Isidro fala pa buné</p>"
				+ "	    <ul>"
				+ "        <li>Vimos todo o esquema de estatico x dinamico </li>"
				+ "        <li>vimos a diferenca de lib/api/fw</li>"
				+ "        <li>fomos apresentados ao maven</li>"
				+ "        <li>fizemos nosso helloworld</li>"
				+ "     </ul>"
				+ "</body>"
				+ "</html>";
	}
	
	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto p = new Produto();
		p.setId(123456);
		p.setDescricao("Computador top de linha");
		p.setPreco(2500);
		p.setQtdeEstoque(5);
		p.setLinkFoto("computador.jpg");
		
		return p;		
	}
	
	@PostMapping("/novoproduto")
	public String adicionarProduto(@RequestBody Object novo) {
		System.out.println("DEBUG - "+novo);
		return "OK";
	}
	
}
