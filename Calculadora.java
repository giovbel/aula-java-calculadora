package calculadora;

public class Calculadora {

	
	private static double somar(double numero1, double numero2){
		
		return numero1 + numero2;
	}
	
    private static double subtrair(double numero1, double numero2){
		
		return numero1 - numero2;
	}

    private static double multiplicar(double numero1, double numero2){
	
	return numero1 * numero2;
}
    private static double dividir(double numero1, double numero2){
		
		return numero1 / numero2;
	}
    
     static public double exibirResultado (double numero1, double numero2, char sinal) {
    	
    	double resultado;
    	
    	
    	if(sinal == '+') {
    		resultado = somar(numero1, numero2);
    	}else if(sinal == '-') {
    		resultado = subtrair(numero1, numero2);
    	}else if(sinal == '*') {
    		resultado = multiplicar(numero1, numero2);
    	}else {
    		resultado = dividir(numero1, numero2);
    	}
    	
    	return resultado;
    }
}
