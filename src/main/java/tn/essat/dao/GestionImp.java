package tn.essat.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import tn.essat.model.Etudiant;
import tn.essat.model.Groupe;

public class GestionImp implements IGestion {
Session session;
	public GestionImp() {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata =  new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();	
		session=sessionFactory.openSession();

	}
	@Override
	public List<Groupe> getAllGroupes() {
org.hibernate.Query<Groupe> q=this.session.createQuery("select g from Groupe g");
List<Groupe> liste=q.getResultList();		
return liste;
	}

	@Override
	public List<Etudiant> getAllEtudiants() {
		org.hibernate.Query<Etudiant> q=this.session.createQuery("select e from Etudiant e");
		List<Etudiant> liste=q.getResultList();	
		return liste;
	}

	@Override
	public List<Etudiant> getAllEtudiantsByGroupeId(int id) {
	return null;
	}

	@Override
	public void addEtudiant(Etudiant etd) {
		this.session.getTransaction();
		this.session.save(etd);	
		this.session.getTransaction().commit();
	}

	@Override
	public void deleteEtudiant(int id) {
		Etudiant et = this.session.load(Etudiant.class, id);
		this.session.getTransaction();
		this.session.delete(et);	
		this.session.getTransaction().commit();		
	}
	
	@Override
	public Etudiant getEtudiantById(int id) {
		Etudiant et = this.session.load(Etudiant.class, id);
		return et;
	}

}
