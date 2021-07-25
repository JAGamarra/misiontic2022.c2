package co.edu.utp.misiontic2022.c2.jgamarra;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws Exception {

        // var input = new Scanner(System.in);

        // System.out.print("Por favor, ingrese un numero: ");
        // var numero = input.nextInt();

        // System.out.printf("El número tiene %d cifras", numDigitos(numero));

        // input.close();

        System.out.println(numeroSuerte("12/07/1980"));
        System.out.println(numeroSuerte("31/05/1999"));

    }

    public static String saludo(String nombre) {
        return "Hola, " + nombre + ".";
    }

    public static int numDigitos(int numero) {
        var cifras = 0;

        while (numero != 0) {
            numero /= 10;
            cifras++;
        }

        return cifras;
    }

    public static int numeroSuerte(String fechaNacimiento) { // 12/07/1980
        var indiceSeparador = fechaNacimiento.indexOf("/");
        var dia = Integer.parseInt(fechaNacimiento.substring(0, indiceSeparador));
        var indiceSeparadorMes = fechaNacimiento.indexOf("/", ++indiceSeparador);
        var mes = Integer.parseInt(fechaNacimiento.substring(indiceSeparador, indiceSeparadorMes++));
        var anho = Integer.parseInt(fechaNacimiento.substring(indiceSeparadorMes));

        var suma = dia + mes + anho;
        var resultado = 0;

        while (suma != 0) {
            resultado += suma % 10;
            suma /= 10;
        }
        return resultado;
    }

}
