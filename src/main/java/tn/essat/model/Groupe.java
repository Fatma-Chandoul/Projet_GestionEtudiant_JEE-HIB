package tn.essat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity(name="gpre")
@Entity

public class Groupe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String titre;

	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Groupe(int id, String titre) {
		super();
		this.id = id;
		this.titre = titre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

}
