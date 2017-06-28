package ma.restaurant.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import ma.restaurant.models.Personne;
import util.HibernateUtil;

public class LoginService {

	public Personne authenticateUser(String email, String mdp) {
		Personne user = getUserByUserId(email);
		if (user != null && user.getEmail().equals(email)
				&& user.getMdp().equals(mdp)) {
			return user;
		} else {
			return null;
		}
	}

	public Personne getUserByUserId(String email) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		Personne user = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from Personne where email='"
					+ email + "'");
			user = (Personne) query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return user;
	}

	public boolean register(Personne user) {
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			session.saveOrUpdate(user);
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<Personne> getListOfUsers() {
		List<Personne> list = new ArrayList<Personne>();
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			list = session.createQuery("from Personne").list();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}
