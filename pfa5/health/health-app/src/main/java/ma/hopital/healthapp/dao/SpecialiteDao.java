package ma.hopital.healthapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.hopital.healthapp.model.Specialite;

public interface SpecialiteDao extends JpaRepository<Specialite, Integer>{
	Specialite findBySpecialiteId(int id);
	Specialite findByLibelle(String libelle);
}
