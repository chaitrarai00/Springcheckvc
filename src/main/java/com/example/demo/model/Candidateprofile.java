package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidateprofile implements Serializable{
	
	private static final long serialVersionUID=111L;

	public long getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(long phoneno) {
		Phoneno = phoneno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
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
	private int cid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	private long Phoneno;
	private String emailid;
	private String name;
	private String latest_Education;
	private String Role;
	
	//certification list,skill list,online profile refernces
}
