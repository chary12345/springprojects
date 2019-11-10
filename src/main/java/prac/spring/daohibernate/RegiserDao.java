package prac.spring.daohibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import prac.spring.idao.IRegisterDao;
import prac.spring.pojo.SpringPracticePojo;

@Repository
public class RegiserDao  implements IRegisterDao{

	public void registerUser(SpringPracticePojo sp) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.save(sp);
		
		session.beginTransaction().commit();
		session.close();
		
	}

}
