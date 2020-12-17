package ma.hopital.healthapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.hopital.healthapp.model.Patient;

public interface PatientDao extends JpaRepository<Patient, Long> {
	Patient findByPatientId(Long id);
}
