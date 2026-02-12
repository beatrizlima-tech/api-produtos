package br.com.cotiinformatica.api_produtos;

import br.com.cotiinformatica.api_produtos.factories.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiProdutosApplication implements CommandLineRunner {

@Autowired
private ConnectionFactory connectionFactory;

	public static void main(String[] args) {
		SpringApplication.run(ApiProdutosApplication.class, args);
	}

	/*
		Método da interface CommandLineRunner que podemos usar para
		executar algum tipo de rotina ou teste assim que o projeto
		for inicializado
	 */

	@Override
	public void run(String... args) throws Exception {

		//Testar a conexão com o banco de dados

		try{

			connectionFactory.getConnection();
			System.out.println("\nCONEXÃO COM O BANCO DE DADOS REALIZADOS COM SUCESSO!");
		}
		catch(Exception e){
			System.out.println("\nFALHA AO CONECTAR COM O BANCO DE DADOS");
			System.out.println(e.getMessage());
		}
	}

}
