package com.customer.api.customer;

import com.customer.api.customer.entity.Produto;
import com.customer.api.customer.service.ProdutoService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Bean
	ApplicationRunner init(ProdutoService service) {
		return args -> {
			Stream.of("Fechadura L", "Tramontina", "Ferramenta").forEach(name -> {
				Produto produto = new Produto();
				produto.setsDescricao(name);
				produto.setsMarca("Tramontina");
				produto.setsTipo("Ferramenta");
				produto.setsQntd("10");

				service.saveProduto(produto);
			});
			service.getProdutos().forEach(System.out::println);
		};
	}
}
