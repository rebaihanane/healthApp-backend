package ma.hopital.healthapp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient implements Serializable{ 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String sexe;
	private Date dateNaissance;
	private String adresse;
	private String ville;
	private String matriculeCnss;
	private String telephone;
	
	
	public Patient(String nom, String prenom, String sexe, Date dateNaissance, String adresse, String ville,
			String matriculeCnss, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.ville = ville;
		this.matriculeCnss = matriculeCnss;
		this.telephone = telephone;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getMatriculeCnss() {
		return matriculeCnss;
	}
	public void setMatriculeCnss(String matriculeCnss) {
		this.matriculeCnss = matriculeCnss;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", dateNaissance="
				+ dateNaissance + ", adresse=" + adresse + ", ville=" + ville + ", matriculeCnss=" + matriculeCnss
				+ ", telephone=" + telephone + "]";
	}
	
	
	

}
