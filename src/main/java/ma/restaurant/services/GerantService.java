package ma.restaurant.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import ma.restaurant.models.Gerant;
import ma.restaurant.models.SendMailTLS;
import util.HibernateUtil;

public class GerantService {
	
	public void addGerant(Gerant p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		
	}
	
	public void UpdateGerant(Gerant p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();
	}
	
	public void DeleteGerant(Gerant p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(p);
		session.getTransaction().commit();
	}
	
	public Gerant getGerantById(Long idG){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Query a = session.createQuery("from Gerant where idPersonne="+idG);
		
		Gerant g = (Gerant) session.load(Gerant.class, idG);
		
		return g;
		
				}
	
	public List<Gerant> getAllGerant(){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		return session.createQuery("from Gerant").list();
		
	}
	
}
