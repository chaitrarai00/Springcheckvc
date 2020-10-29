package com.example.demo.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.springframework.stereotype.Service;

import com.example.demo.model.Candidateprofile;
import com.example.demo.model.SerializedCandidateprofile;
import com.example.demo.repository.SerializedUserRepository;

@Service
public class SerializedService {
	private SerializedUserRepository repo;

	public SerializedService(SerializedUserRepository repo) {
		this.repo = repo;
	}
	
	public void persist(Candidateprofile cp) {
		//get byte array
		byte[] serializedcp=convert(cp);
		//persist/save object
		SerializedCandidateprofile serializedobject=new SerializedCandidateprofile(serializedcp);
		repo.save(serializedobject);
	}
	
	private byte[] convert(Candidateprofile cp) {
		//try byte array from byteOutputstrem with resources
		try(ByteArrayOutputStream outputstream=new ByteArrayOutputStream();
		ObjectOutputStream objectoutputstream=new ObjectOutputStream(outputstream)){
			objectoutputstream.writeObject(cp);
			return outputstream.toByteArray();
		}
		catch(IOException eio) {
			eio.printStackTrace();
		}
		return new byte[0];
	}
}
