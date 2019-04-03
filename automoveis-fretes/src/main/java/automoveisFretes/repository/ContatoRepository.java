package automoveisFretes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import automoveisFretes.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

	
}
