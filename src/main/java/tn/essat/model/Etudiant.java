package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	@ManyToOne
	@JoinColumn(name = "gpe_id")
	private Groupe gp;

	// @OneToMany
	// private List<Note> notes;
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(int id, String nom, Groupe gp) {
		super();
		this.id = id;
		this.nom = nom;
		this.gp = gp;
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

	public Groupe getGp() {
		return gp;
	}

	public void setGp(Groupe gp) {
		this.gp = gp;
	}

}
