package ma.restaurant.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import ma.restaurant.models.Client;
import util.HibernateUtil;

public class ClientService {
	

	
	public void addClient(Client p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}
	
	public void UpdateClient(Client p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();
	}
	
	public void DeleteClient(Client p)
	{
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(p);
		session.getTransaction().commit();
	}
	
	public Client getClientById(Long idC){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Query a = session.createQuery("from Client where idPersonne="+idC);
		
		
		Client g = (Client) a.uniqueResult();
		
		return g;
		
				}
	
	public List<Client> getAllClient(){
	       List<Client> liste = null;
	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	session.beginTransaction();
	Query sql = session.createQuery("from Client");
	
	liste=sql.list();
	return liste;
	
}
	
    public void updateClient(Client p) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(p);
            trns.commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

}
