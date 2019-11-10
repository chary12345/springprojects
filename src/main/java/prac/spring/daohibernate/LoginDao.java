package prac.spring.daohibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import prac.spring.idao.ILoginDao;
import prac.spring.pojo.SpringPracticePojo;

@Repository
public class LoginDao implements ILoginDao{

	public List<SpringPracticePojo> loginUser(SpringPracticePojo sp,long mobile) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Query q = session.createQuery("from SpringPracticePojo where mobile= :mobile");
		q.setParameter("mobile", mobile);
		List<SpringPracticePojo> list = q.list();
		System.out.println(list.get(0));
		session.close();
		return list;
	}

	public List<SpringPracticePojo> getAllUser(SpringPracticePojo sp) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Query q = session.createQuery("from SpringPracticePojo");
		List<SpringPracticePojo> userlist = q.list();
		return userlist;
	}

}
