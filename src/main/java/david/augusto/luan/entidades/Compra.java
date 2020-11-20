package david.augusto.luan.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "compra")
@Data
@Getter @Setter
public class Compra implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "valor")
	private double valor;
	@Column(name = "data")
	private Date data;
	@Column(name = "observacao")
	private String observacao;
	@Column(name = "recebido")
	private boolean recebido;
	
}
