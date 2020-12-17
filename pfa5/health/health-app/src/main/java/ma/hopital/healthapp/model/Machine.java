package ma.hopital.healthapp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Machine implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String libelle;
	private boolean etat;
	
	public Machine(String libelle, boolean etat) {
		super();
		this.libelle = libelle;
		this.etat = etat;
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
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	@Override
	public String toString() {
		return "Machine [id=" + id + ", libelle=" + libelle + ", etat=" + etat + "]";
	}
	
	
	
	
	

}
