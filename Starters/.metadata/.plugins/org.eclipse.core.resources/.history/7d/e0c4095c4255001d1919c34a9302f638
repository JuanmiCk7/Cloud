package com.nttdata;

public class Temperatura {
	
	private String formato;
	
	public Temperatura(String formato) {
		this.formato = formato.toLowerCase();
	}
	
	public String getTemp(float temp) {
		
		switch (formato) {
		case "celsius":
			return String.valueOf(farhToCelsius(temp)) + "ºF";
		case "fahrenheit":
			return String.valueOf(celciusToFahr(temp)) + "ºC";
		default:
			return String.valueOf(farhToCelsius(temp)) + "ºF";
		}
	}
	
	public static double celciusToFahr(float temp) {
		return ((9f /5 ) * temp) + 32;
	}
	
	public static double farhToCelsius(float temp) {
		return ((temp - 32)*5)/9;
	}
	
}
