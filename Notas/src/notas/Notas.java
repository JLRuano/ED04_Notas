package notas;

import java.util.Scanner;

public class Notas {

public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
int n = 0;
String c = "";
System.out.print("Introduzca el valor de una calificación: ");
n = reader.nextInt();

c = Califica.califica(n);

System.out.println(c);
reader.close();
}

/**
 * @param numero
 * @return
 * @deprecated Use {@link Califica#califica(int)} instead
 */
private static String cali(int numero) {
	return Califica.califica(numero);
}

/**
 * @param num_nota
 * @return
 * @deprecated Use {@link Califica#califica(int)} instead
 */
private static String califica(int num_nota) {
	return Califica.califica(num_nota);
}
}