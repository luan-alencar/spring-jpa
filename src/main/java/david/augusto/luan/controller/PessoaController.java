package david.augusto.luan.controller;

import javax.persistence.EntityManagerFactory;

import org.springframework.stereotype.Controller;

import david.augusto.luan.entidades.Pessoa;

@Controller
public class PessoaController {

	private EntityManagerFactory entityManagerFactory;

	public PessoaController(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	public void create(Pessoa p) {
	};

	public void edit() {
	};

	public void destroy() {
	};

	public void finAll() {
	};

	public void findById() {
	}

	public char[] findPessoaEntities() {

		return null;
	};
}
