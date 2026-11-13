import java.util.Scanner;
/**
 *Programa que calcula el tiempo de inversion y el rendimiento de la inversion
 *Objetivo creacion y uso de objetos de clases exteriores
 *@author Rodriguez Espinosa Diomedis Estefany
 *@version 1.0
 */

public class TiempoDeInversion{
   /**
    *Metodo principal que calcula el tiempo de inversion y el rendimiento
    */
    public static void main(String[]arg){
	String nombre;
	double monto;
	String respuesta;
	Scanner in = new Scanner(System.in);
	System.out.println("Hola bienvenido al programa que calcula el tiempo de inversion");
        System.out.println("Cual es tu nombre?");
        nombre = in.nextLine();//Lee el nombre del inversionista
	do{
	    System.out.println("Hola " + nombre + " cual es el monto a invertir?");
	    monto = in.nextDouble();
            if(monto>0){
		monto = monto;
            }else{
		throw new Error(monto + " no es un monto valido");
            }
	    //Fecha de inicio de la inversion
            System.out.println("Cual es el dia de inicio de tu inversion?");
	    int dia = in.nextInt();
	    System.out.println("Cual es el mes de inicio de tu inversion?");
	    int mes = in.nextInt();
	    System.out.println("Cual es el anio de inicio de tu inversion?");
	    int anio = in.nextInt();
	    Fecha inicioFecha = new Fecha(dia, mes, anio);
	    
	    //Fecha de fin de la inversion
	    System.out.println("Cual es el dia del fin de tu inversion?");
	    int diaFinal = in.nextInt();
	    System.out.println("Cual es el mes del fin de tu inversion?");
	    int mesFinal = in.nextInt();
	    System.out.println("Cual es el anio del fin de tu inversion?");
	    int anioFinal = in.nextInt();
	    Fecha fechaFinal = new Fecha(diaFinal, mesFinal, anioFinal);

	    if(fechaFinal.fechaEnDias() < inicioFecha.fechaEnDias()){
		throw new Error("La fecha final no puede ser antes de la fecha inicial");
	    }

	    //Calcula la diferencia de dias entre las dos fechas
	    int diasInversion = fechaFinal.diferenciaEnDias(inicioFecha);
	    System.out.println("Los dias de su inversion seran: " + diasInversion);

            //Calcula el rendimiento
	    double rendimiento = monto * 0.12 * (diasInversion / 365.0);
	    
	    System.out.println("Su rendimiento sera: " + rendimiento);
	    System.out.println("¿Desea hacer otra simulacion?");
	    in.nextLine();
	    respuesta = in.nextLine().toLowerCase();
	}while(respuesta.equals("si"));
    }
    
}
