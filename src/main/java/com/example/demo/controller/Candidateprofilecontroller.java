package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.CandidateprofileRepo;
import com.example.demo.model.Candidateprofile;

@Controller
public class Candidateprofilecontroller {
	@Autowired
	CandidateprofileRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/getcandidate")
	public ModelAndView getcandidate(@RequestParam Integer cid) {
		ModelAndView mv=new ModelAndView("showcandidatedetails.jsp");
		Candidateprofile cp=repo.findById(cid).orElse(new Candidateprofile());
		mv.addObject(cp);
		return mv;
	}

}
