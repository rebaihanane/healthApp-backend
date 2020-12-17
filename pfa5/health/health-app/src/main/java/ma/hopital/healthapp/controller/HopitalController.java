package ma.hopital.healthapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.hopital.healthapp.dao.HopitalDao;
import ma.hopital.healthapp.model.Hopital;

@RestController
@RequestMapping("hopital")
@CrossOrigin(origins = "http://localhost:4200")
public class HopitalController {
	
	@Autowired
	private HopitalDao hopitalDao;
	
	@GetMapping("/all")
	public List<Hopital> findAll() {
		return hopitalDao.findAll();
	}
	@GetMapping("/find/{id}")
	public Hopital findById(@PathVariable int id) {
		return hopitalDao.findByHopitalId(id);
	}
	@PostMapping("/save")
	public void save(@RequestBody Hopital hopital) {
		hopitalDao.save(hopital);
	}
	
	@GetMapping(value = "/count")
	public long count() {
		return hopitalDao.count();
	}
	@DeleteMapping(value = "/delete/{id}")
	public void deleteById(@PathVariable(required = true)String id) {
		System.out.println("id = " + id);
		Hopital hopital = hopitalDao.findByHopitalId(Integer.parseInt(id));
		hopitalDao.delete(hopital);
	}
	
	
}
