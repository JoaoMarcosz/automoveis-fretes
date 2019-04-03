package automoveisFretes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import automoveisFretes.model.Contato;
import automoveisFretes.repository.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	
	@Transactional
	public Contato salvarContato (Contato contato) {
		return this.contatoRepository.save(contato);
	}
	
	@Transactional(readOnly=true)
	public List<Contato> listarContatos(){
		return this.contatoRepository.findAll();
	}
	
	@Transactional
	public void removeContatoPorId(Long id) {
		this.contatoRepository.deleteById(id);
	}
	
	public Contato buscaContatoPorId(Long id) {
		return this.contatoRepository.getOne(id);
	}
	
	@Transactional
	public void atualizarContato(Contato contato) {
		this.contatoRepository.saveAndFlush(contato);
	}
}
