package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.SerializedCandidateprofile;

public interface SerializedUserRepository extends CrudRepository<SerializedCandidateprofile, Integer>{

}

