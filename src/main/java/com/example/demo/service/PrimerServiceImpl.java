package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;

@Service("primerService")
public class PrimerServiceImpl implements IPrimerService {

	@Override
	public List<Persona> getPersonas() {
		List<Persona> personaList = new ArrayList<Persona>();
		personaList.add(new Persona("José", "Toro"));
		personaList.add(new Persona("Gabriela", "Farencena"));
		personaList.add(new Persona("Tatiana", "Rojas"));
		return personaList;
	}

}
