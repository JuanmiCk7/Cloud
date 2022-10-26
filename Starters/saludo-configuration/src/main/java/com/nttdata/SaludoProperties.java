package com.nttdata;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("saludo.mensaje")
@Getter
@Setter
public class SaludoProperties {
	
	private String idioma = "";

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}