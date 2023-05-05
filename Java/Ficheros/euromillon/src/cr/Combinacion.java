package cr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Combinacion {
	
	protected static final int VALOR_MINIMO = 1;
	protected static final int VALOR_MAXIMO_NUMEROS = 50;
	protected static final int VALOR_MAXIMO_ESTRELLAS = 12;
	protected static final int TOTAL_NUMEROS = 5;
	protected static final int TOTAL_ESTRELLAS = 2;
	
	private Collection<Integer> numeros;
	private Collection<Integer> estrellas;
	
	public Combinacion (int n1, int n2, int n3, int n4, int n5, int e1, int e2) throws CombinacionException {
		super();
		numeros = new HashSet<>(Set.of(n1, n2, n3, n4, n5));
		estrellas = new HashSet<>(Set.of(e1, e2));
		if (validarDatos(this)==false) {
			numeros.clear();
			estrellas.clear();
			throw new CombinacionException("No sirve");
		}
		
		
		
	}
	
	public Combinacion (int[] numeros, int[] estrellas) throws CombinacionException {
		this.numeros = new HashSet<>();
		this.estrellas= new HashSet<>();
		for (int i: numeros) {
			this.numeros.add(i);
		}
		for (int i: estrellas) {
			this.estrellas.add(i);
		}
		
		if (validarDatos(this)==false) {
			this.numeros.clear();
			this.estrellas.clear();
			throw new CombinacionException("No sirve");
		}
		
	}

	public Collection<Integer> getNumeros() {
		return numeros;
	}

	public Collection<Integer> getEstrellas() {
		return estrellas;
	}
	
	public int comprobarCombinacion (Combinacion c) {
		int numeros=0;
		for (Integer i: c.numeros) {
			for (Integer a: this.numeros) {
				if(i==a) {
					numeros++;
				}
			}
		}
		
		for (Integer b: c.estrellas) {
			for (Integer d: this.estrellas) {
				if(b==d) {
					numeros++;
				}
			}
		}
		
		return numeros;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estrellas, numeros);
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && getClass() == obj.getClass()) {
			Combinacion other = (Combinacion) obj;
			esIgual = Objects.equals(estrellas, other.estrellas) && Objects.equals(numeros, other.numeros);
		}
		
		
		return esIgual;
	}
	

	@Override
	public String toString() {
		return numeros + " " +estrellas;
	}
	
	private boolean validarDatos(Combinacion combi) {
		boolean resultado=true;
		if (combi.numeros.size()==TOTAL_NUMEROS || combi.estrellas.size()==TOTAL_ESTRELLAS) {
			for (Integer i: combi.numeros) {
				if (resultado && ( i> VALOR_MAXIMO_NUMEROS || i<VALOR_MINIMO)) {
					resultado=false;
				}
			}
			for (Integer a: combi.estrellas) {
				if (resultado && ( a> VALOR_MAXIMO_ESTRELLAS || a<VALOR_MINIMO)) {
					resultado=false;
				}
			}
			
		}else {
			resultado=false;
		}
		
		return resultado;
	}
	
	

	public int numeroDeNumerosConsecutivos() {
		int contador=1;
		boolean stop = true;
		List<Integer> auxiliar = new ArrayList<>();
		auxiliar.addAll(numeros);
		for(int i=1; i<5 ; i++) {
			if(auxiliar.get(i)==auxiliar.get(i-1)+1 && stop) {
				contador++;
			}else {
				stop=false;
			}
		}
		
		
		return contador;
	}
	
	

}
