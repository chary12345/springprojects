package prac.spring.controllers;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import prac.spring.daohibernate.RegiserDao;
import prac.spring.idao.IRegisterDao;
import prac.spring.pojo.SpringPracticePojo;

@Controller
public class ResgiserController {
	private final static Logger log = Logger.getLogger(ResgiserController.class);
	
	@Autowired
	IRegisterDao dao ;
	@RequestMapping(value = "/Register",method = RequestMethod.POST)
	public String registerUser(SpringPracticePojo sp ,Model m){
		log.info("entered in to user register method");
		
		dao.registerUser(sp);
		
		
		m.addAttribute("result", "register successful,login for profile page");
		log.debug("exit register method");
		return "Login";
		
	}
}
