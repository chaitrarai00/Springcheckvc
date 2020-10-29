package com.example.demo.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Candidateprofile;

@RestController
@RequestMapping
public class SerializationResource {

	@PostMapping
	public String post(@RequestBody final Candidateprofile cp) {
		
	}
}
