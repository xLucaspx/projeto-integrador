package app;

import dao.FornecedorDao;
import factory.ConnectionFactory;
import java.sql.Connection;
import models.Endereco;
import models.Formato;
import models.Fornecedor;
import models.Produto;

public class App {
	public static void main(String... args) {
		Endereco e1 = new Endereco("90000-000", "Av. João Inacio", "Navegantes", "Canoas", "PR");
		Endereco e2 = new Endereco("90040-191", "Av. Venâncio Aires", "Azenha", "Porto Alegre", "RS");
		e1.setNumero("12");
		e1.setComplemento("Próximo ao Orfeu");

		System.out.println(e1);
		System.out.println("\n" + e2);

		Fornecedor f1 = new Fornecedor("14.167.876/0001-47","Aqui o Nome Fantasia",
				"empresa@email.com", "(51) 99876-5543", e2);
		Fornecedor f2 = new Fornecedor("14167876000147", "Aqui NF", "fulano@dominio.sub.com.br", "5133456788",
				e2);
                f2.setNome("editado");
                f2.setEmail("emailEditado@email.com");
                f2.setTelefone("51 987654321");

		System.out.println("\n" + f1);
		System.out.println("\n" + f2);

		Produto p1 = new Produto("567787632", "Água da Pedra - com gás - 500ml", Formato.UNIDADE, 3, 3.75f, 1.25f);
		
                Connection con = ConnectionFactory.getConnection();
                FornecedorDao f = new FornecedorDao(con);
                f.exclui(f2);

		System.out.println("\n" + p1);
		
	}
}
