package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CandidateProfile {
	@Override
	public String toString() {
		return "CandidateProfile [Phoneno=" + Phoneno + ", emailid=" + emailid + ", name=" + name
				+ ", latest_Education=" + latest_Education + ", Role=" + Role + "]";
	}
	public int getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(int phoneno) {
		Phoneno = phoneno;
	}
	public int getEmailid() {
		return emailid;
	}
	public void setEmailid(int emailid) {
		this.emailid = emailid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLatest_Education() {
		return latest_Education;
	}
	public void setLatest_Education(String latest_Education) {
		this.latest_Education = latest_Education;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	@Id
	private int Phoneno;
	private int emailid;
	private String name;
	private String latest_Education;
	private String Role;
	
	//certification list,skill list,online profile refernces
}
