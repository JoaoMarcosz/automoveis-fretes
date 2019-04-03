package automoveisFretes.model.cargos;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import automoveisFretes.model.Funcionario;
import automoveisFretes.model.Veiculo;

@Entity
public class Motorista extends Funcionario {
	
	@OneToOne
	private Veiculo veiculo; 

}
