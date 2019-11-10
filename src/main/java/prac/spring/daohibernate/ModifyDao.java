package prac.spring.daohibernate;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import prac.spring.idao.ImodifyDao;
import prac.spring.pojo.SpringPracticePojo;

@Repository
public class ModifyDao implements ImodifyDao {
	private static final Logger log = Logger.getLogger(ModifyDao.class);
	private static Session Connection() {
		SessionFactory sessionfact = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionfact.openSession();
		log.info("Connection Created------------------------------------------------------");
		return session;
	}
	public List<SpringPracticePojo> deleteUser(long mobile) {
		Session session = Connection();
		Transaction txn = session.beginTransaction();
		System.out.println("delete button triggered");
		Query query = session.createQuery("delete from SpringPracticePojo where mobile = :mobile");
		query.setParameter("mobile", mobile);
		System.out.println("delted mobile" + mobile);
		query.executeUpdate();
		log.info("record deleted for mobile" + mobile);
txn.commit();

Query queryAllUsers = session.createQuery("from SpringPracticePojo");
		log.info("fetching record from db create query");
		List<SpringPracticePojo> list = queryAllUsers.list();

		log.info("record details" + list.get(0));

		session.close();
		return list;

	}

	public List<SpringPracticePojo> editUser(long mobile) {
log.info("entered into edit method");
Session session = Connection();
Transaction txn = session.beginTransaction();

Query query = session.createQuery("from SpringPracticePojo where mobile = :mobile");
query.setParameter("mobile", mobile);
List<SpringPracticePojo> list = query.list();


log.info("exit from edit method");
return list;
	}

	public List<SpringPracticePojo> updateUser(SpringPracticePojo sp) {
		Session session = Connection();
		Transaction txn = session.beginTransaction();
		
			session.update(sp);
		System.out.println("updated record");
			txn.commit();
			
		

Query q = session.createQuery("from SpringPracticePojo");
List<SpringPracticePojo> list = q.list();

//System.out.println("updated record "+list.get(0).getMobile());x
session.close();
return list;	

}
}