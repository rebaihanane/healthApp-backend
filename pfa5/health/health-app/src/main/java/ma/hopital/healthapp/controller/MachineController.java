package ma.hopital.healthapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.hopital.healthapp.dao.MachineDao;
import ma.hopital.healthapp.model.Machine;

@RestController
@RequestMapping("machines")
public class MachineController {
	
	@Autowired
	private MachineDao machineDao;
	
	@GetMapping("/all")
	public List<Machine> findAll() {
		return machineDao.findAll();
	}
	@GetMapping("/find/{id}")
	public Machine findById(@PathVariable int id) {
		return machineDao.findByMachineId(id);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Machine machine) {
		machineDao.save(machine);
	}

	@GetMapping(value = "/count")
	public long count() {
		return machineDao.count();
	}
	@DeleteMapping(value = "/delete/{id}")
	public void deleteById(@PathVariable(required = true)String id) {
		System.out.println("id = " + id);
		Machine machine = machineDao.findByMachineId(Integer.parseInt(id));
		machineDao.delete(machine);
	}
	
}
