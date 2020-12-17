package ma.hopital.healthapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Hopital implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private String adresse;
	
	public Hopital() {
		super();
	}
	
	public Hopital(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	@Override
	public String toString() {
		return "Hopital [id=" + id + ", nom=" + nom + ", adresse=" + adresse + "]";
	}
	
	
}
