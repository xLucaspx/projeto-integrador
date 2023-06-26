package app;

import models.Endereco;
import models.Formato;
import models.Fornecedor;
import models.Produto;

public class App {
	public static void main(String... args) {
		Endereco e1 = new Endereco("90040191", "Av. Venâncio Aires", "Azenha", "Porto Alegre", "rs");
		Endereco e2 = new Endereco("90040-191", "Av. Venâncio Aires", "Azenha", "Porto Alegre", "RS");
		e2.setNumero("93");
		e2.setComplemento("Próximo à livraria bamboletras");

		System.out.println(e1);
		System.out.println("\n" + e2);

		Fornecedor f1 = new Fornecedor("14.167.876/0001-47", "Aqui a Razão Social", "Aqui o Nome Fantasia",
				"empresa@email.com", "(51) 99876-5543", e2);
		Fornecedor f2 = new Fornecedor("14167876/000147", "Aqui RS", "Aqui NF", "fulano@dominio.sub.com.br", "5133456788",
				e1);

		System.out.println("\n" + f1);
		System.out.println("\n" + f2);

		Produto p1 = new Produto("567787632", "Água da Pedra - com gás - 500ml", Formato.UNIDADE, 3, 1.75f, 3.25f);
		Produto p2 = new Produto("678892712", "Água da Pedra - sem gás - 1.5l", Formato.UNIDADE, 1, 2.25f, 4.95f, 0.3f);

		System.out.println("\n" + p1);
		System.out.println("\n" + p2);
	}
}
