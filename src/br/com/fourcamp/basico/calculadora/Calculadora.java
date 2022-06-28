package br.com.fourcamp.basico.calculadora;

public interface Calculadora {
	
	public static Double calculaValor(String operador, Double valorA, Double valorB) {
		Double resultado;
		switch (operador) {
		case "+" -> resultado = valorA + valorB;
		case "-" -> resultado = valorA - valorB;
		case "/" -> resultado = valorA / valorB;
		case "*" -> resultado = valorA * valorB;
		case "^" -> resultado = Math.pow(valorA, valorB);
		case "R" -> resultado = Math.pow(valorA, 1.0 / valorB);
		case "%" -> resultado = valorA * valorB / 100;
		default -> throw new IllegalArgumentException("Operador não aceito: " + operador);
		}
		return resultado;
	}

}