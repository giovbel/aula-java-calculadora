package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestarCalculadora {

	public static void main(String[] args) {
		
       Scanner input = new Scanner(System.in);
       
       Calculadora c1 = new Calculadora();
       Calculadora c2 = new Calculadora();
       Calculadora c3 = new Calculadora();
       Calculadora c4 = new Calculadora();
		
	    double numero1;
		double numero2;
		char sinal;
		double resultado;
	
		
		try {
			
			System.out.println("");
			System.out.println("  CALCULADORA");
			System.out.println("----------------");
			System.out.println("");
			System.out.print("Primeiro número: ");
			numero1 = input.nextDouble();
			
			System.out.print("Segundo número: ");
			numero2 = input.nextDouble();
			
			System.out.println("");
			System.out.println("+ para soma    - para subtração   * para multiplicação   / para divisão");
			System.out.println("");
			System.out.print("O sinal da operação: ");
			
			sinal = input.next().charAt(0);
			
			
			if( sinal != '+' && sinal != '-' &&  sinal != '*' && sinal  != '/') {
				System.out.println("O sinal digitado não corresponde!");
			} else {
				
			if(sinal == '/' && numero2 == 0) {
				System.out.println("Não é possível dividir por zero!");
			} else {
				resultado = c1.exibirResultado(numero1, numero2, sinal);
				System.out.println("");
				System.out.println("==> O resultado é: "+ numero1 + " "+ sinal +" "+ numero2 +" = " + resultado);
			
			
			/////////////////Instância c2////////////////////////////////////////
			
			System.out.println("");
			System.out.println("  CALCULADORA 2");
			System.out.println("----------------");
			System.out.println("");
			
			System.out.println("");
			System.out.print("Primeiro número: ");
			numero1 = input.nextDouble();
			
			System.out.print("Segundo número: ");
			numero2 = input.nextDouble();
			
			System.out.println("");
			System.out.println("+ para soma    - para subtração   * para multiplicação   / para divisão");
			System.out.println("");
			System.out.print("O sinal da operação: ");
			
			sinal = input.next().charAt(0);
			
			
			if( sinal != '+' && sinal != '-' &&  sinal != '*' && sinal  != '/') {
				System.out.println("O sinal digitado não corresponde!");
			} else {
				resultado = c2.exibirResultado(numero1, numero2, sinal);
				System.out.println("");
				System.out.println("==> O resultado é: "+ numero1 + " "+ sinal +" "+ numero2 +" = " + resultado);
			}
 			
            /////////////////Instância c3////////////////////////////////////////
			
			System.out.println("");
			System.out.println("  CALCULADORA 3");
			System.out.println("----------------");
			System.out.println("");
			
			System.out.println("");
			System.out.print("Primeiro número: ");
			numero1 = input.nextDouble();
			
			System.out.print("Segundo número: ");
			numero2 = input.nextDouble();
			
			System.out.println("");
			System.out.println("+ para soma    - para subtração   * para multiplicação   / para divisão");
			System.out.println("");
			System.out.print("O sinal da operação: ");
			
			sinal = input.next().charAt(0);
			
			
			if( sinal != '+' && sinal != '-' &&  sinal != '*' && sinal  != '/') {
				System.out.println("O sinal digitado não corresponde!");
			} else {
				resultado = c3.exibirResultado(numero1, numero2, sinal);
				System.out.println("");
				System.out.println("==> O resultado é: "+ numero1 + " "+ sinal +" "+ numero2 +" = " + resultado);
			}
			
            /////////////////Instância c4////////////////////////////////////////
			
			System.out.println("");
			System.out.println("  CALCULADORA 4");
			System.out.println("----------------");
			System.out.println("");
			
			System.out.println("");
			System.out.print("Primeiro número: ");
			numero1 = input.nextDouble();
			
			System.out.print("Segundo número: ");
			numero2 = input.nextDouble();
			
			System.out.println("");
			System.out.println("+ para soma    - para subtração   * para multiplicação   / para divisão");
			System.out.println("");
			System.out.print("O sinal da operação: ");
			
			sinal = input.next().charAt(0);
			
			
			if( sinal != '+' && sinal != '-' &&  sinal != '*' && sinal  != '/') {
				System.out.println("O sinal digitado não corresponde!");
			} else {
				resultado = c4.exibirResultado(numero1, numero2, sinal);
				System.out.println("");
				System.out.println("==> O resultado é: "+ numero1 + " "+ sinal +" "+ numero2 +" = " + resultado);
			}
			}
			}
			
			//////////////////////////////////////////////////////////
			
		} catch (InputMismatchException erro) {
			System.out.println("Só é possível calcular números !");
		}
		
	}

}
