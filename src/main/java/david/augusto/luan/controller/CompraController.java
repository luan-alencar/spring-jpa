package david.augusto.luan.controller;

import javax.persistence.EntityManagerFactory;

import org.springframework.stereotype.Controller;

import david.augusto.luan.entidades.Compra;

@Controller
public class CompraController {
	
	private EntityManagerFactory entityManagerFactory;


	public CompraController(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	public void create(Compra c1) {
	};

	public void edit() {
	};

	public void destroy() {
	};

	public void finAll() {
	};

	public void findById() {
	}

}
