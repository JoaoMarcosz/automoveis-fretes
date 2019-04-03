package automoveisFretes.model;

/**
 * @author JoaoMarcos,AlexEustáquio.
 *
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import automoveisFretes.model.cargos.Motorista;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Transient
	private String placa;
	
	@OneToOne
	private Motorista motorista;
	@Transient
	private String marca;
	@Transient
	private String nome;

}
