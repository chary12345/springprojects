package prac.spring.daohibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import prac.spring.idao.IResultDao;
import prac.spring.pojo.SpringPracPojo;
@Repository
public class ResultDao implements IResultDao{

	public void adminUser(SpringPracPojo sp1) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
	Transaction txn = session.beginTransaction();
		
	session.save(sp1);
	System.out.println("reult"+sp1.getResult());
	txn.commit();
	
		session.close();
		
		
		
		
	}

}
