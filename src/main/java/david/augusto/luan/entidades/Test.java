package david.augusto.luan.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import david.augusto.luan.controller.CompraController;
import david.augusto.luan.controller.PessoaController;

public class Test {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();

		Date d = new Date();

		p.setNome("Isabela");
		p.setLoggin("isabela tal");
		p.setEmail("icastilhog@gmail.com");
		p.setSenha("teste");

		List<Compra> compras = new ArrayList<>();

		Compra c1 = new Compra();
		c1.setData(d);
		c1.setObservacao("compra impressora");
		c1.setRecebido(true);
		c1.setValor("890");
		CompraController c = new CompraController(EmProvider.getInstance().getEntityManagerFactory());
		
		c.create(c1);
		compras.add(c1);

		p.setCompraList(compras);

		PessoaController j = new PessoaController(EmProvider.getInstance().getEntityManagerFactory());
		j.create(p);

		System.out.println(j.findPessoaEntities());
	}
}
