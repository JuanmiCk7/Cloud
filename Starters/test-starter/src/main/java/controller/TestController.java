package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.Saludo;

@RestController
public class TestController {
	
	@Autowired
	private Saludo saludo;
	
	@GetMapping(path="/prueba")
	public String pruebaSaludo() {
		return saludo.mensajeSaludo();
	}
	
}
