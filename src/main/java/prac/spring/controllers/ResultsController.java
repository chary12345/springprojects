package prac.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import prac.spring.idao.IResultDao;
import prac.spring.pojo.SpringPracPojo;

@Controller
public class ResultsController {
	@Autowired
	IResultDao dao;
	@RequestMapping(value="/Result",method=RequestMethod.POST)
	public String adminUser(SpringPracPojo sp1,Model m) {
		dao.adminUser(sp1);
		
		m.addAttribute("record","result submitted successfully");
		
		return "Admin result";


}
}