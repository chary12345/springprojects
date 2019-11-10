package prac.spring.daohibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import antlr.collections.List;
import prac.spring.idao.IMapping;
import prac.spring.pojo.SpringPracticePojo;

public class ResultMappingDao implements IMapping {

	public List resultDisplay(SpringPracticePojo sp) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		
		
		return null;
	}

}
