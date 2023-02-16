package notas;

import java.util.Scanner;

public class Notas {

public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir un dato num�rico por teclado
int n = 0;
String c = "";
System.out.print("Introduzca el valor de una calificaci�n: ");
n = reader.nextInt();

c = cali(n);

System.out.println(c);
reader.close();
}

/**
 * @param numero
 * @return
 */
private static String cali(int numero) {
	String c;
	if (numero >= 0 && numero < 5)
	c = "Suspenso";
	else if (numero >= 5 && numero < 7)
	c = "Aprobado";
	else if (numero >= 7 && numero <9)
	c = "Notable";
	else if (numero >= 9 && numero <= 10)
	c = "Sobresaliente";
	else
	c = "El valor de la calificaci�n introducida no es correcta";
	return c;
}
}