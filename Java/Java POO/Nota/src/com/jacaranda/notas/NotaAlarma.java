package com.jacaranda.notas;

import java.time.LocalDateTime;

public class NotaAlarma extends Nota implements Activable {
	

	private static final int MINUTOS_REPETIR_POR_DEFECTO = 5;
	private LocalDateTime fechaAlarma;
	private int minutosRepetir;
	private boolean activado;

	public NotaAlarma(String texto, LocalDateTime fechaAlarma, boolean ativado) {
		super(texto, fechaAlarma);
		setFechaAlarma(fechaAlarma);
		this.activado=activado;
		this.minutosRepetir=MINUTOS_REPETIR_POR_DEFECTO;
	}
	public NotaAlarma(String texto, LocalDateTime fecha, int min) {
		super(texto, fecha);
		setFechaAlarma(fecha);
		this.activado=activado;
		this.minutosRepetir=min;
	}
	public static int getMinutosRepetirPorDefecto() {
		return MINUTOS_REPETIR_POR_DEFECTO;
	}
	private void setFechaAlarma(LocalDateTime fechaAlarma) {
		this.fechaAlarma = fechaAlarma;
	}
	
	public void activar() {
		this.activado=true;
	}
	
	public void desactivar() {
		this.activado=false;
	}
	
	public boolean isActivado() {
		return this.activado;
	}
	
	@Override
	public String toString() {
		return "Alarma del " + fechaAlarma + ", minutosRepetir " + minutosRepetir + ", activado="
				+ activado;
	}
	
	
	

}
