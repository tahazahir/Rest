package ma.restaurant.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import ma.restaurant.models.Plat;
import ma.restaurant.models.Reservation;
import ma.restaurant.models.Table;
import util.HibernateUtil;

public class PlatService {
	public void addPlat(Plat p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}
	
	public void UpdatePlat(Plat p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();
	}
	
	public void DeletePlat(Plat p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(p);
		session.getTransaction().commit();
	}
	
	public Plat getPlatById(Long idP){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Query a = session.createQuery("from Plat where idPlat="+idP);
		Plat g = (Plat) session.load(Plat.class, idP);
		
		return g;
		
				}
	
	public List<Plat> getAllPlat(){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		return session.createQuery("from Plat").list();
		
	}
	public void addPlatToReservation(Long idReservation,Long idPlat){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Reservation p = (Reservation) session.load(Reservation.class, idReservation);
		
		Plat c = (Plat) session.load(Plat.class, idPlat);
		
		c.getReservations().add(p);
		p.getPlats().add(c);
		
		
		session.getTransaction().commit();
	}

}
