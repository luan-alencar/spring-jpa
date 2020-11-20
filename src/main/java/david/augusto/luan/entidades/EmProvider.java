package david.augusto.luan.entidades;

import javax.persistence.EntityManagerFactory;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class EmProvider {
	private static final String DB_PU = "AplicaçãoPU";

	public static final boolean DEBUG = true;

	public static final EmProvider singleton = new EmProvider();

	private EntityManagerFactory emf;

	public static EmProvider getInstance() {
		return singleton;
	}
}
