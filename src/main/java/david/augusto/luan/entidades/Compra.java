package david.augusto.luan.entidades;

import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class Compra {

	private Long id;
	private double valor;
	private Date data;
	private String observacao;
}
