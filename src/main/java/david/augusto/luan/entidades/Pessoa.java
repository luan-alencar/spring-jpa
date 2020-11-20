package david.augusto.luan.entidades;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class Pessoa {

	private Long id;
	private String loggin;
	private String senha;
	private String email;
	private String nome;
}
