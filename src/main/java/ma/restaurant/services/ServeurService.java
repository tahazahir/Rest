package ma.restaurant.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import ma.restaurant.models.Serveur;
import util.HibernateUtil;

public class ServeurService {
	public void addServeur(Serveur p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}
	
	public void UpdateServeur(Serveur p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();
	}
	
	public void DeleteServeur(Serveur p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(p);
		session.getTransaction().commit();
	}
	
	public Serveur getServeurById(Long idS){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Query a = session.createQuery("from Serveur where idPersonne="+idS);
		
		Serveur g = (Serveur) session.load(Serveur.class, idS);
		
		return g;
		
				}
	
	public List<Serveur> getAllServeur(){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		return session.createQuery("from Serveur").list();
		
	}
}
