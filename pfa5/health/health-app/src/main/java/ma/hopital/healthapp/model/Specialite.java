package ma.hopital.healthapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Specialite implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String libelle;
	
	
	public Specialite(String libelle) {
		super();
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Specialite [id=" + id + ", libelle=" + libelle + "]";
	}
	
	
	
	
	
}
