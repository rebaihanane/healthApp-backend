package ma.hopital.healthapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.hopital.healthapp.model.Specialite;

public interface SpecialiteDao extends JpaRepository<Specialite, Long>{
	Specialite findBySpecialiteId(Long id);
	Specialite findByLibelle(String libelle);
}
