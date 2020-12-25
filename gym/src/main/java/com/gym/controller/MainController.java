package com.gym.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.gym.dao.MemberDao;
import com.gym.dao.MemberInfoImp;
import com.gym.model.Login;
import com.gym.model.MemberInfo;

@Controller
public class MainController {
	
	MemberDao memberDao = new MemberInfoImp();

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginPage(Login login) {

		ModelAndView mv = new ModelAndView();
		String user = "raaz";
		String pass = "1234";

		if (login.getUsername().equalsIgnoreCase(user)) {
			if (login.getPassword().equalsIgnoreCase(pass)) {

				mv.setViewName("empAcess");
			}
		} else {
			mv.setViewName("index");
		}

		return mv;
	}

	@RequestMapping(value = "/member")
	public ModelAndView signUpPage() {
		ModelAndView mv = new ModelAndView("signupform");
		return mv;
	}

	@RequestMapping(value = "/member", method = RequestMethod.POST)
	public ModelAndView saveMember(@ModelAttribute("member") MemberInfo member) {
		memberDao.saveMember(member);
		//System.out.println("success");
		ModelAndView mv = new ModelAndView("redirect://viewmembers");
		return mv;
		
		// all employeess list
	}

	@RequestMapping("/viewmembers")
	public ModelAndView listAllMembers() {
		ModelAndView mv = new ModelAndView();
		List<MemberInfo> list = memberDao.getMembers();
		
		mv.addObject("list", list);
		mv.setViewName("gymmembers");
		return mv;

	}
	@RequestMapping(value = "/confirmation/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id) {
		ModelAndView mv = new ModelAndView("confirmation");
		mv.addObject("id", id);
		return mv;
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView editMember(ModelAndView mv, @PathVariable int id) {
		// #TODO GET EMPLOYEE DETAILS USING ID FROM DATABASE
		MemberInfo memberInfo = memberDao.getMemberById(id);
		mv.addObject("memberInfo",memberInfo);
		mv.setViewName("updatemember");
		return mv;
		}
	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView updatemember(MemberInfo member) {
		memberDao.updateMember(member);
		ModelAndView mv = new ModelAndView("redirect:/viewmembers");
		return mv;
	}

	@RequestMapping("/delete/{id}")
	public ModelAndView deleteMember(@PathVariable int id){
		memberDao.deleteMember(id);
		ModelAndView mv = new ModelAndView("redirect://viewmembers");
		return mv;
	}
}
