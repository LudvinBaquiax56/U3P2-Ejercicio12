import java.util.*;

public class Ejercicio12 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int alturatotalmujeres = 0;
		int alturatotalvarones = 0;

		int totaledad = 0;
		double promedioedad = 0;
		
		int totalmujeres = 0;
		double promediomujeres = 0;

		int totalvarones = 0;
		double promediovarones = 0;

		int altura;
		do {
			System.out.println("Ingrese la altura en centimetros");
			altura = scanner.nextInt();
			if (altura>0) {
				System.out.println("Ingrese la edad");
				int edad = scanner.nextInt();
				System.out.println("Ingrese el sexo");
				System.out.println("1. Masculino");
				System.out.println("2. Femenino");
				int sexo =  scanner.nextInt();
				if (sexo==1) {
					alturatotalvarones = alturatotalvarones+altura;
					totalvarones = totalvarones+1;
				} else {
					alturatotalmujeres = alturatotalmujeres+altura;
					totalmujeres = totalmujeres+1;
				}
				totaledad = totaledad+edad;
			}
		} while (altura!=0);
		promediovarones = alturatotalvarones/totalvarones;
		promediomujeres = alturatotalmujeres/totalmujeres;
		promedioedad = totaledad/(totalvarones+totalmujeres);
		System.out.println("El promedio de altura de las mujeres es "+promediomujeres+" centimetros");
		System.out.println("El promedio de altura de los varones es "+promediovarones+" centimetros");
		System.out.println("El promedio de edad de los participantes es "+promedioedad+" anios");
	}


}

