package com.nttdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.Temperatura;

@RestController
public class TempController {

	@Autowired
	private Temperatura temperatura;
	
	@GetMapping(path="/prueba/{temp}")
	public String getTemp(@PathVariable(name="temp") long temp) {
		System.out.println(temperatura.getTemp(temp));
		return temperatura.getTemp(temp);
	}
	
}
