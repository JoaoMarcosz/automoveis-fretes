package automoveisFretes.model;

/**
 * @author JoaoMarcos,AlexEustáquio.
 *
 */

import automoveisFretes.model.cargos.ASG;
import automoveisFretes.model.cargos.Carregador;
import automoveisFretes.model.cargos.Diretor;
import automoveisFretes.model.cargos.Gerente;
import automoveisFretes.model.cargos.Mecanico;
import automoveisFretes.model.cargos.Motorista;
import automoveisFretes.model.cargos.Supervisor;

public enum Cargo {

	GERENTE{
		@Override
		public Funcionario obterFuncionario() {
			// TODO Auto-generated method stub
			return new Gerente();
		}
	},
	DIRETOR {
		@Override
		public Funcionario obterFuncionario() {
			// TODO Auto-generated method stub
			return new Diretor();
		}
	},
	SUPERVISOR {
		@Override
		public Funcionario obterFuncionario() {
			// TODO Auto-generated method stub
			return new Supervisor();
		}
	},
	MOTORISTA {
		@Override
		public Funcionario obterFuncionario() {
			// TODO Auto-generated method stub
			return new Motorista();
		}
	},
	MECANICO {
		@Override
		public Funcionario obterFuncionario() {
			// TODO Auto-generated method stub
			return new Mecanico();
		}
	},
	CARREGADOR {
		@Override
		public Funcionario obterFuncionario() {
			// TODO Auto-generated method stub
			return new Carregador();
		}
	},
	ASG {
		@Override
		public Funcionario obterFuncionario() {
			// TODO Auto-generated method stub
			return new ASG();
		}
	};
	
	public abstract Funcionario obterFuncionario();
}
