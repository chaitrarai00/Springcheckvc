package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.CandidateProfileRepo;

@Controller
public class CandidateProfilecontroller {
	@Autowired
	CandidateProfileRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

}
