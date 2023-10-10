import java.util.Scanner;
import java.util.Scanner;
public class p9_1s21{
	public static void main(String[] args) {
	    Scanner teclado= new Scanner(System.in);
	    Scanner valor= new Scanner(System.in);
	    String operacion;
	    System.out.println("Que tipo de operacion desea realizar?");
	    System.out.println("Escribala: Suma, Resta, Multiplicacion, Division");
	    operacion = teclado.nextLine();
	   if (operacion.equals("Suma")){
	   	System.out.println("Haremos una suma");
	   	System.out.println("Introduza el primer numero");
		int numero1 = valor.nextInt();
		System.out.println("Introduza el segundo numero");
		int numero2 = valor.nextInt();
		int suma = numero1 + numero2;
		System.out.println("El resultado de la suma es: " + suma);
	   }
	   if (operacion.equals("Resta")){
	   	System.out.println("Haremos una resta");
	   	System.out.println("Introduza el primer numero");
		int numero1 = valor.nextInt();
		System.out.println("Introduza el segundo numero");
		int numero2 = valor.nextInt();
		int resta = numero1 - numero2;
		System.out.println("El resultado de la resta es: " + resta);
	   }
	   if (operacion.equals("Multiplicacion")){
	   	System.out.println("Haremos una multiplicacion");
	   	System.out.println("Introduza el primer numero");
		int numero1 = valor.nextInt();
		System.out.println("Introduza el segundo numero");
		int numero2 = valor.nextInt();
		int multiplicacion = numero1 * numero2;
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
	   }
	   if (operacion.equals("Division")){
	   	System.out.println("Haremos una division");
	   	System.out.println("Introduza el primer numero");
		int numero1 = valor.nextInt();
		System.out.println("Introduza el segundo numero");
		int numero2 = valor.nextInt();
		int division = numero1 / numero2;
		System.out.println("El resultado de la division es: " + division);
	   }
	}
}