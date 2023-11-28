package br.gov.go.sefaz.Declaracao;

public class Time1 {
	private int horas; // 0-23
	private int minutos; // 0 - 59
	private int segundos; // 0 - 59
	
	public void setTime(int horas, int minutos, int segundos) {
		
		// Valida hora, minuto,  segundo
		if(horas < 0 || horas >= 24 || minutos < 0 || minutos >= 60 || segundos < 0 || segundos >= 60) {
			throw new IllegalArgumentException("hora, minuto e/ou segundo fora do alcance");
		}
		
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", horas, minutos, segundos);
	}
	
	//Converte em String no formato padrão de data/hora (H:MM:SS AM ou PM)
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((horas == 0 || horas == 12) ? 12 : horas % 12), minutos, segundos, (horas <12 ? "AM" : "PM"));
	}
}
