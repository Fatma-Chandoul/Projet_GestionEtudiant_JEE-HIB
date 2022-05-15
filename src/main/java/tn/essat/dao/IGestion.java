package tn.essat.dao;

import java.util.List;

import tn.essat.model.Etudiant;
import tn.essat.model.Groupe;

public interface IGestion {
	public List<Groupe> getAllGroupes();
	public List<Etudiant> getAllEtudiants();
	public List<Etudiant> getAllEtudiantsByGroupeId(int id);
	public void addEtudiant(Etudiant etd);
	public void deleteEtudiant (int id);
	public Etudiant getEtudiantById(int id);

}
