package notas;

import java.util.Scanner;

public class Notas {

public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
int n = 0;
String c = "";
System.out.print("Introduzca el valor de una calificación: ");
n = reader.nextInt();

c = califica(n);

System.out.println(c);
reader.close();
}

/**
 * @param numero
 * @return
 * @deprecated Use {@link #califica(int)} instead
 */
private static String cali(int numero) {
	return califica(numero);
}

/**
 * @param num_nota
 * @return
 */
private static String califica(int num_nota) {
	String c;
	if (num_nota >= 0 && num_nota < 5)
	c = "Suspenso";
	else if (num_nota >= 5 && num_nota < 7)
	c = "Aprobado";
	else if (num_nota >= 7 && num_nota <9)
	c = "Notable";
	else if (num_nota >= 9 && num_nota <= 10)
	c = "Sobresaliente";
	else
	c = "El valor de la calificación introducida no es correcta";
	return c;
}
}