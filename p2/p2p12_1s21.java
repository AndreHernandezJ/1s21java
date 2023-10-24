import java.util.Scanner;
public class p2p12_1s21{
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int f,c;
	System.out.println("Ingresa el numero de filas");
	f=teclado.nextInt();
	System.out.println("Ingresa el numero de columnas");
	c=teclado.nextInt();
	int [][] MA=new int[f][c];
	int [][] MB=new int[f][c];
	int [][] MC=new int[f][c];
	int ff,fc;
	for(ff=0;ff<f;ff++){
		for(fc=0;fc<c;fc++){
			System.out.println("Ingresa el valor para la posicion ["+ff+"]["+fc+"]");
			MA[ff][fc]=teclado.nextInt();
		}
	}
	for(ff=0;ff<f;ff++){
		for(fc=0;fc<c;fc++){
			System.out.println("Ingresa el valor para la posicion ["+ff+"]["+fc+"]");
			MB[ff][fc]=teclado.nextInt();
		}
	}
	for(ff=0;ff<f;ff++){
		for(fc=0;fc<c;fc++){
			MC[ff][fc]=MA[ff][fc]+MB[ff][fc];
		}
	}
	for(ff=0;ff<f;ff++){
		for(fc=0;fc<c;fc++){
			System.out.println("El resultado de la suma de la matriz en su posicion ["+ff+"]["+fc+"] es "+MC[ff][fc]);
		}
	}
}
}