package com.jacaranda.notas;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota implements Comparable<Nota> {
	
	private static int codigoSiguiente;
	private int codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	public Nota (String texto, LocalDateTime fechaCreacion) {
		this.texto=texto;
		this.codigo=codigoSiguiente++;
		this.fechaCreacion=fechaCreacion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
		this.fechaUltimaModificacion= this.fechaUltimaModificacion.now();
	}

	public int getCodigo() {
		return codigo;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	
	public boolean isModificado() {
		return this.fechaCreacion.isBefore(this.fechaUltimaModificacion);
	}
	
	public boolean isEmpty() {
		return this.texto!=null && this.texto.length() ==0;
	}
	
	public boolean isCreadoAnterior(Nota nota) {
		return this.fechaCreacion.isBefore(nota.fechaCreacion);
	}
	
	public boolean isModificacionAterior(Nota nota) {
		return this.fechaUltimaModificacion.isBefore(nota.fechaUltimaModificacion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaCreacion, texto);
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual= this == obj;
		if (!esIgual && obj != null && getClass() == obj.getClass()) {
			Nota other = (Nota) obj;
			esIgual=Objects.equals(fechaCreacion, other.fechaCreacion) && Objects.equals(texto, other.texto);
		}
		
		return esIgual;
	}

	@Override
	public String toString() {
		return "codigo: " + codigo + ": " + texto ;
	}

	@Override
	public int compareTo(Nota o) {
		return this.codigo-o.codigo;
	}
	
	
	
	

}
