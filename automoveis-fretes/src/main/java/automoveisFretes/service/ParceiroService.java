package automoveisFretes.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import automoveisFretes.model.Parceiro;
import automoveisFretes.repository.ParceiroRepository;

@Service
public class ParceiroService {

	@Autowired
	ParceiroRepository parceiroRepository;
	
	@Transactional
	public Parceiro salvarParceiro(Parceiro parceiro) {
		return parceiroRepository.save(parceiro); 
	}
	
	public List<Parceiro> listarParceiroes() {
		return parceiroRepository.findAll();
	}
	
	@Transactional
	public void removerParceiro(Long id) {
		parceiroRepository.deleteById(id);
	}
	
	public Parceiro buscarParceiro (Long id) {
		return parceiroRepository.getOne(id);
	}
	
	@Transactional
	public Parceiro atualizarParceiro(Parceiro parceiro) {
		return parceiroRepository.saveAndFlush(parceiro);
	}

}


