package ma.hopital.healthapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.hopital.healthapp.model.Hopital;

public interface HopitalDao extends JpaRepository<Hopital, Integer> {
	
	Hopital findByHopitalId(int id);
	
}
