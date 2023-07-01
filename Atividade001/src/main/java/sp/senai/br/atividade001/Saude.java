/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.atividade001;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Saude {
    
    public static void main(String args[]) {
		
    Scanner lerTeclado = new Scanner(System.in);
        double a, peso, imc;
			
	System.out.printf("Por favor insisra o seu peso \n");
	peso = lerTeclado.nextDouble();
			
	System.out.printf("Por favor insira a sua altura: \n");
	a = lerTeclado.nextDouble();
			
	imc = peso / (a * a);
				
            if(imc < 18.5) {
            System.out.printf("Voce esta abaixo do peso ideal, seu imc e: " + imc + " kg/m2");
            }
            else if(imc >= 18.5 && imc <= 24.9){
            System.out.printf("Voce esta no peso ideal, seu imc e: " + imc + " kg/m2");
            }
            else if(imc >= 25.0 && imc <= 29.9){
            System.out.printf("Voce esta com pre-obesidade, seu imc e: " + imc + " kg/m2");
            }
            else if(imc >= 30.0 && imc <= 34.9){
            System.out.printf("Voce esta com obesidade grau |, seu imc e: " + imc + " kg/m2");
            }
            else if(imc >= 35.0 && imc <= 39.9){
            System.out.printf("Voce esta com obesidade grau ||, seu imc e: " + imc + " kg/m2");
            }
            else {
            System.out.printf("Voce esta com obesidade grau |||, seu imc e: " + imc + " kg/m2");
            }
    }
}
