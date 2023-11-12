package co.edu.sena.miscelanea;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    Scanner scr = new Scanner(System.in);
    Ejercicios ejercicios = new Ejercicios();

    double number1 = 0, number2 = 0, number3 = 0, number4 = 1.07, number5 = 3.1416;

    // menú
        System.out.println("Miscelánea de Ejercicios Java");
        System.out.println("*********************************");
        System.out.println();
        System.out.println("OPERADORES");
        System.out.println("1. Calcular el área de un triángulo");
        System.out.println("Ingrese la base del triángulo");
    number1 = scr.nextDouble();
        System.out.println("Ingrese la altura del triángulo");
    number2 = scr.nextDouble();
        System.out.println("El área del triángulo es:" + ejercicios.AreaTriángulo(number1, number2));

        System.out.println("**********************************");
        System.out.println();
        System.out.println("2. Ingresar dos números por la consola y sumarlos");
        System.out.println("Ingrese el primer número");
    number1 = scr.nextDouble();
        System.out.println("Ingrese el segundo número");
    number2 = scr.nextDouble();
        System.out.println("La suma de los dos números es:" + ejercicios.SumaResultado(number1, number2));

        System.out.println("**********************************");
        System.out.println();
        System.out.println("3. Ingresar un número y visualizar el número elevado al cuadrado");
        System.out.println("Ingrese el número a elevar");
    number1 = scr.nextDouble();
        System.out.println("El resultado del número elevado es:" + ejercicios.cuadrado(number1));

        System.out.println("**********************************");
        System.out.println();
        System.out.println("4. Escribir un programa que convierta de euros a dólares");
        System.out.println("Ingrese el valor en Euros");
    number1 = scr.nextDouble();
        System.out.println("El valor en dorales es:" + ejercicios.convertir(number1, number4));

        System.out.println("**********************************");
        System.out.println();
        System.out.println("5. Hallar el área y perimetro de un cuadrado");
        System.out.println("Ingrese el lado del cuadrado");
    number1 = scr.nextDouble();
        System.out.println("el área del cuadrado es:" +ejercicios.area(number1));
    number2 = scr.nextDouble();
        System.out.println("el perimetro del cuadrado es:" +ejercicios.perimetro(number1));

        System.out.println("*********************************");
        System.out.println("6. Calcular el area y volumen de un cilindro");
        System.out.println("Ingrese la base del cilindro");
    number1 = scr.nextDouble();
        System.out.println("Ingreso la altura del cilindro:");
        System.out.println("el área de un cilindro es:" +ejercicios.areacilindro(number1,number2));
    number1 = scr.nextDouble();
        System.out.println("el volumen de un cilindro es:" + ejercicios.volumencilindro(number1,number2));

        System.out.println("**********************************");
        System.out.println();
        System.out.println("7. Escribir un programa que lea el radio de una circunferencia y calcule la longitud de la misma y el área del círculo inscrito");
        System.out.println("Ingrese el radio de la circunferencia");
    number1 = scr.nextDouble();
        System.out.println("la longitud de la circunferencia es:"+ ejercicios.longitudcircunferencia(number1));
    number1 = scr.nextDouble();
        System.out.println("el area de la circunferencia es"+ ejercicios.circunferencia(number1));

        System.out.println("**********************************");
        System.out.println();
        System.out.println("8 Este programa calculara el promedio de 3 número");
        System.out.println("Ingrese el primer número");
    number1 = scr.nextDouble();
        System.out.println("Ingrese el segundo número");
    number2 = scr.nextDouble();
        System.out.println("Ingrese el tercera número");
    number3 = scr.nextDouble();
        System.out.println("el promedio de los tres números es:"+ejercicios.promedio(number1,number2,number3));
}
}