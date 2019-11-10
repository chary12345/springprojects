package prac.spring.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import prac.spring.idao.ImodifyDao;
import prac.spring.pojo.SpringPracticePojo;

@Controller
public class ModifyController {
	private static final Logger log = Logger.getLogger(ModifyController.class);
	@Autowired
	ImodifyDao dao;
	@RequestMapping(value="/deleterecord",method=RequestMethod.POST)
public String deleteUser(@RequestParam("mobile") long mobile ,Model m){
		log.info("Entered into deleteUser");
		List<SpringPracticePojo> deleteUser = dao.deleteUser(mobile);
		log.debug(mobile+" deted mobile");
		m.addAttribute("allusers", deleteUser);
		log.info("exit from deleteUser method");
	return "Profile";
	
}	
	@RequestMapping(value="/editrecord",method=RequestMethod.POST)
	public String editUser(@RequestParam("mobile") long mobile,Model m){
		System.out.println("triggerd Edit button");
		List<SpringPracticePojo> editrecord =dao.editUser(mobile);
		m.addAttribute("editrecord",editrecord.get(0));
		return "Edit";
		
	}
	@RequestMapping(value="/updateRecord",method= RequestMethod.POST)
	public String updteUser(SpringPracticePojo sp,@RequestParam("mobile")long mobile,Model m){
		log.info("entered into update User method");
		
		List<SpringPracticePojo> updateRecordrecord =	dao.updateUser(sp);
		for (SpringPracticePojo sy : updateRecordrecord) {
			System.out.println(sy.getName());
			System.out.println(sy.getMobile());
		}
		log.debug(updateRecordrecord.get(0));
		
		m.addAttribute("allusers",updateRecordrecord);
		log.info("exit from upadte user method");
		return "Profile";
		
	}
}
