package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.CandidateProfile;


public interface CandidateProfileRepo extends CrudRepository<CandidateProfile, Integer>
{

}
