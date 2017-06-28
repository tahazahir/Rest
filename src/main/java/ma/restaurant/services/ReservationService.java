package ma.restaurant.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import ma.restaurant.models.Reservation;
import util.HibernateUtil;

public class ReservationService {
	public void addReservation(Reservation p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}
	
	public void UpdateReservation(Reservation p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();
	}
	
	public void DeleteReservation(Reservation p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(p);
		session.getTransaction().commit();
	}
	
	public Reservation getReservationById(Long idR){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Query a = session.createQuery("from Reservation where idPersonne="+idR);
		Reservation g = (Reservation) session.load(Reservation.class, idR);
		
		return g;
		
				}
	
	public List<Reservation> getAllReservation(){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		return session.createQuery("from Reservation").list();
		
	}
	public List<Reservation> GetTableLibreR(String d,String t) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query = session.getNamedQuery("tableLibre").setString("dateReservation","2017-06-02");
	
		return query.list();
	}
	
	public List<Reservation> GetTableLibreRR(String t) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query = session.getNamedQuery("tableLibreR").setString("temps","d�ner");
	
		return query.list();
	}
	public List<Reservation> getAllFacture(){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		return session.createQuery("from Reservation where ID_FACTURE is null").list();
		
	}

}
