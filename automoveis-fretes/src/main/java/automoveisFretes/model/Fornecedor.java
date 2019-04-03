package automoveisFretes.model;

/**
 * @author JoaoMarcos,AlexEustáquio.
 *
 */

import javax.persistence.Entity;
import javax.persistence.Transient;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class Fornecedor extends EntidadeExterna {
	@Transient
	private String cpf;
	
}
