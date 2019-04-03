package automoveisFretes.model;

/**
 * @author JoaoMarcos,AlexEustáquio.
 *
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import lombok.Data;

@Entity
@Data
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	@Transient
	private String rua;
	@Transient
	private int numero;
	@Transient
	private String bairro;
	@Transient
	private String cidade;
	@Transient
	private String estado;
	@Transient
	private String cep;
	@Transient
	private String complemento;
	
	@OneToOne
	private EntidadeExterna entidadeExterna;
	
	
}
