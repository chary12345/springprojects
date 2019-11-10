package prac.spring.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import prac.spring.idao.ILoginDao;
import prac.spring.pojo.SpringPracticePojo;

@Controller
public class LoginController {
	private static Logger log = Logger.getLogger(LoginController.class);
	@Autowired
	ILoginDao dao;

	@RequestMapping(value= "/Login",method=RequestMethod.POST)
	public String loginUser(SpringPracticePojo sp,@RequestParam("mobile") long mobile,Model m){
		log.info("entered into loginUser method");
		List<SpringPracticePojo> loginUser = dao.loginUser( sp, mobile);
		if(loginUser.isEmpty()){
			log.debug("invalid user");
			m.addAttribute("result","invalid user");
			return "Login";
		}else
		log.debug("get mobile number"+mobile);
		System.out.println(mobile);
		List<SpringPracticePojo> allUser = dao.getAllUser(sp);
		m.addAttribute("allusers",allUser);
		
		log.info("exit LoginUser");
		return "Profile";
		
	}
}
