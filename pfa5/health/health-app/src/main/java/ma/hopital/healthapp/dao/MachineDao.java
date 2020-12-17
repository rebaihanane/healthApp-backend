package ma.hopital.healthapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.hopital.healthapp.model.Machine;

public interface MachineDao extends JpaRepository<Machine, Integer> {
	Machine findByMachineId(int id);
}
