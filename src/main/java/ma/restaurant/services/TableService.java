package ma.restaurant.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import ma.restaurant.models.Table;
import util.HibernateUtil;

public class TableService {
	public void addTable(Table p) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}

	public void UpdateTable(Table p) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.update(p);
		session.getTransaction().commit();
	}

	public void DeleteTable(Table p) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.delete(p);
		session.getTransaction().commit();
	}

	public Table getTableById(Long idT) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Query a = session.createQuery("from Table where idTable=" + idT);
		Table g = (Table) session.load(Table.class, idT);

		return g;

	}

	public List<Table> getAllTable() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		return session.createQuery("from Table").list();

	}
//NOT IN (SELECT distinct id_Table FROM Reservation r where temps = '"+ Temps + "' and DATE_RESERVATION LIKE '" + Date + "%') 
	public List<Table> GetTableLibre(String Date, String Temps) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery("from Table t , Reservation r where t.idTable = r.tables");
		session.getTransaction().commit();
		return query.list();
	}


}
