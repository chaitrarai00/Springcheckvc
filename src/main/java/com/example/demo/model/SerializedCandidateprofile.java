package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SerializedCandidateprofile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	public SerializedCandidateprofile() {
		
	}

	public SerializedCandidateprofile(byte[] serializedcp) {
		this.serializedcp = serializedcp;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public byte[] getSerializedcp() {
		return serializedcp;
	}

	public void setSerializedcp(byte[] serializedcp) {
		this.serializedcp = serializedcp;
	}

	private byte[] serializedcp;//byte conversion of a value to byte array ie. serialized
}
