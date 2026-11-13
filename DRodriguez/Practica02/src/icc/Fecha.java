/**
 *Programa que utiliza diferentes metodos para la manipulacion de fechas
 *Objetivo trabajar con la creacion de metodos y uso de objetos de clases exteriores
 *@author Rodriguez Espinosa Diomedis Estefany
 *@version 1.0
 */

public class Fecha{
    private int dia;
    private int mes;
    private int anio;
    private String mesCadena;

   /**
    * Constructor por omision. Construye la fecha 1/1/2026
    */
    public Fecha(){
	this(1,1,2026);
    }

   /**Constructor de una fecha a partir del dia,  el mes y el año
    *@param d - numero del dia
    *@param m - numero del mes
    *@param a - numero del año
    */
    public Fecha(int d, int m, int a){
	asignarDia(d);
	asignarMes(m);
	asignarAnio(a);
    }

   /**Constructor de una fecha a partir del dia, el mes y el año
    *@param d - numero del dia
    *@param m - nombre del mes
    *@param a - numero del año
    */
    public Fecha(int d, String m, int a){
	asignarDia(d);
	asignarMes(m);
	asignarAnio(a);
    }
   /**Metodo que asigna un valor valido al dia de una fecha
    *@param d - numero del dia
    */
    public void asignarDia(int d){
	if(d <= 31 && d>0){
	    dia = d;
	}else{
	   throw new Error("El valor"+" " + d +" "+ "no es apropiado para los dias del mes");
	}
    }
   /**Metodo que asigna un valor valido al mes de una fecha
    *@param m - numero del mes
    */
    public void asignarMes(int m){
	if(m <= 12 && m>0){
	    mes = m;
	}else{
	   throw new Error("El valor"+" "+ + m +" "+ "no es apropiado para un mes");
	}	    
    }
   /**Metodo que asigna una cadena valida al mes de una fecha
    *@param m - nombre del mes
    */
    public void asignarMes(String m){
	mesCadena = m;
	mesCadena = mesCadena.toLowerCase();
	
	if(mesCadena.equals("enero")){
	    mes = 1;
        }
	else if(mesCadena.equals("febrero")){
	    mes = 2;
        }
    	else if(mesCadena.equals("marzo")){
            mes = 3;
        }
 	else if(mesCadena.equals("abril")){
	    mes = 4;
	}
	else if(mesCadena.equals("mayo")){
	    mes = 5;
        }
	else if(mesCadena.equals("junio")){
	    mes = 6;
	}
	else if(mesCadena.equals("julio")){
	    mes = 7;
        }
        else if(mesCadena.equals("agosto")){
	    mes = 8;
        }
	else if(mesCadena.equals("septiembre")){
	    mes = 9;
	}
	else if(mesCadena.equals("octubre")){
	    mes = 10;
        }
        else if(mesCadena.equals("noviembre")){
	    mes = 11;
	}
        else if(mesCadena.equals("diciembre")){
	    mes = 12;
	}else{
	   throw new Error(m+" "+"no es un nombre valido para un mes");
	} 	
    }	
   /**Metodo que asigna un valor valido al año de una fecha
    *@param a - numero del año
    */
    public void asignarAnio(int a){
	if(a>0){
	    anio = a;
	}else{
	    throw new Error("El valor"+" " + a +" " + "no es apropiado para un año");
	}
    }
   /**Metodo que devuelve el dia de una fecha
    *@return numero que representa el dia
    */
    public int obtenerDia(){
	return dia;
    }
   /**Metodo que devuelve el mes de una fecha
    *@return numero que representa el mes
    */
    public int obtenerMes(){
	return mes;
    }
   /**Metodo que devuelve el año de una fecha
    *@return numero que representa el año
    */
    public int obtenerAnio(){
	return anio;
    }
   /**Metodo que devuelve la fecha en formato dia/mes/año
    *@return cadena con la fecha en el formato dia/mes/año
    */
    public String toString(){
	return dia + "/" + mes + "/" + anio;
    }
   /**Metodo que calcula la diferencia en dias entre dos fechas
    *@param fecha2 - segunda fecha con la que se hara la diferencia
    *@return cantidad de dias de diferencia entre ambas fechas
    */
    public int diferenciaEnDias(Fecha fecha2){
	int dias1  = this.fechaEnDias();
        int dias2  = fecha2.fechaEnDias();
        if(dias1>dias2){
	    return dias1 - dias2;
	}else{
	    return dias2 - dias1;
	}
    }
   /**Metodo auxiliar que calcula los dias de cada mes
    *@param mes - numero que representa cada mes
    *@return cantidad de dias del mes
    */
    public int diasDelMes(int mes){
	if( mes == 1){return 31;}
	else if(mes == 2){
	    if(esBisiesto(anio)){
		return 29;
	    }else{
		return 28;
	    }
	}
	else if(mes == 3){return 31;}
	else if(mes == 4){return 30;}
	else if(mes == 5){return 31;}
	else if(mes == 6){return 30;}
	else if(mes == 7){return 31;}
	else if(mes == 8){return 31;}
	else if(mes == 9){return 30;}
	else if(mes == 10){return 31;}
	else if(mes == 11){return 30;}
	else if(mes == 12){return 31;}
	return -1;
    }
   /**Metodo auxiliar que calcula los dias de cada mes
    *@param mes - numero que representa cada mes
    *@return cantidad de dias del mes
    */
    public boolean esBisiesto(int anio){
        if(anio % 400 == 0){
	    return true;
        }else if(anio % 100 == 0){
            return false;
        }else if(anio % 4 == 0){
            return true;
        }else{
	    return false;
        }
    }
   /**Metodo auxiliar que calcula una fecha en dias
    *@return cantidad de dias que representa una fecha
    */
    public int fechaEnDias(){
	int totalEnDias = 0;
	int i =1;
	int l = 1;
	//Suma los dias de los años pasados
	while(i<anio){
	    if(esBisiesto(i)){
		totalEnDias = totalEnDias + 366;
	    }else{
		totalEnDias = totalEnDias + 365;
	    }
	    i++;
	}
	//Suma los dias de los meses pasados
	while(l<mes){
	    totalEnDias = totalEnDias + diasDelMes(l);
	    l++;
	}
	//Suma los dias actuales del mes
	totalEnDias = totalEnDias + obtenerDia();

	return totalEnDias;
	
    }
   /**Metodo que suma los dias o resta una cantidad de dias a una fecha
    *@param diasASumar - numero de dias que se desean añadir
    *@return la nueva fecha con la cantidad de dias añadidos o sustraidos
    */
    public Fecha sumarDias(int diasASumar){
	int nuevoDia = this.dia + diasASumar;
	int nuevoMes = this.mes;
	int nuevoAnio = this.anio;

        // Si los días se pasan del límite del mes actual
        while (nuevoDia > diasDelMes(nuevoMes)){
	    nuevoDia = nuevoDia - diasDelMes(nuevoMes);
             nuevoMes++;
	     if (nuevoMes > 12){
		 nuevoMes = 1;
                 nuevoAnio++;
             }
        }

        // Si los días quedan en 0 o negativos 
        while (nuevoDia <= 0){
	    nuevoMes--;
	    if (nuevoMes < 1){
		nuevoMes = 12;
		nuevoAnio--;
            }
	    nuevoDia = nuevoDia + diasDelMes(nuevoMes);
        }

        return new Fecha(nuevoDia, nuevoMes, nuevoAnio);
    }

   /**Metodo que determina si dos fechas son iguales
    *@param fechaDiferente - la nueva fecha que se compara con la anterior
    *@return true si ambas fechas son iguales, false en caso contrario
    */
    public boolean esIgual(Fecha fechaDiferente){
	if(fechaDiferente == null) {
	    return false;
        }
        if(this.dia != fechaDiferente.obtenerDia()){
            return false;
        }
        if(this.mes != fechaDiferente.obtenerMes()) {
            return false;
        }
        if(this.anio != fechaDiferente.obtenerAnio()){
	    return false;
        }
        return true; 
    }
   /**Metodo que devuelve el numero correspondiente a un mes a partir de que reciba una cadena con su nombre.
    *@param nombreMes - cadena con el nombre del mes
    *@return numero del mes o -1 si el nombre no corresponde
    */
    public int obtenerNumeroMes(String nombreMes){
	if(nombreMes == null){
	    return -1;
        }
        String mesN = nombreMes.toLowerCase();

        if(mesN.equals("enero")){return 1;}
        if(mesN.equals("febrero")){return 2;}
        if(mesN.equals("marzo")){return 3;}
        if(mesN.equals("abril")){return 4;}
        if(mesN.equals("mayo")){return 5;}
        if(mesN.equals("junio")){return 6;}
        if(mesN.equals("julio")){return 7;}
        if(mesN.equals("agosto")){return 8;}
        if(mesN.equals("septiembre")){return 9;}
        if(mesN.equals("octubre")){return 10;}
        if(mesN.equals("noviembre")){return 11;}
        if(mesN.equals("diciembre")){return 12;}

        return -1;
    }
    /**Metodo que devuelve la cadena correspondiente a un mes a partir de un numero.
    *@param numMes - numero del mes
    *@return el nombre del mes
    */
    public String obtenerNombreMes(int numMes){
	if(numMes == 1){return "enero";}
        if(numMes == 2){return "febrero";}
        if(numMes == 3){return "marzo";}
        if(numMes == 4){return "abril";}
        if(numMes == 5){return "mayo";}
        if(numMes == 6){return "junio";}
        if(numMes == 7){return "julio";}
        if(numMes == 8){return "agosto";}
        if(numMes == 9){return "septiembre";}
        if(numMes == 10){return "octubre";}
        if(numMes == 11){return "noviembre";}
        if(numMes == 12){return "diciembre";}
    
        return "Mes no valido";
    }
   /**Metodo que devuelve los dias transcurridos en el año
    *@return el numero de dias transcurridos en el año
    */
    public int diasTranscurridosAnio(){
	int totalDias = 0;
        int i = 1;
    
        while (i<mes){
	    totalDias = totalDias + diasDelMes(i);
            i++;
        }
        totalDias = totalDias + this.dia;
        return totalDias;
    }

   /**Metodo que transforma la fecha en formato dd/mes/aaaa
    *@return cadena con la fecha en el formato dd/mes/aaaa
    */
    public String toStringConNombre(){
	return this.dia + "/" + obtenerNombreMes(this.mes) + "/" + this.anio;
    }   

}
