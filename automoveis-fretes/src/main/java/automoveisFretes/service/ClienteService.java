package automoveisFretes.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automoveisFretes.model.Cliente;
import automoveisFretes.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente cadastrarCliente(Cliente cliente) {
		Cliente clienteCadastrar = clienteRepository.save(cliente);
		return clienteCadastrar;
	}
	
	public List<Cliente> listarClientes() {
		return clienteRepository.findAll();
	}
	
	public Cliente buscarClientePorId(Long id) {
		return buscarCliente(id);
	}
	
	private Cliente buscarCliente(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletarCliente (Long id) {
		Cliente c = buscarCliente(id);
		clienteRepository.delete(c);
	}
	
	public Cliente atualizarCliente(Cliente cliente) {
		Cliente c;
		if(cliente.getClass() != null) {
			c = buscarCliente(cliente.getClass());
			return clienteRepository.saveAndFlush(c);
		} else {
			return clienteRepository.save(cliente);
		}
	}
	
	private Cliente buscarCliente(Class<? extends Cliente> class1) {
		// TODO Auto-generated method stub
		return null;
	}


}
