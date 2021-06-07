Algoritmo Ejercicio12
	Definir promedioVarones Como Real
	Definir promedioMujeres Como Real
	Definir promedioEdad Como Real
	
	Definir totalEdad Como Real
	Definir alturaTotalMujeres Como Entero
	Definir totalMujeres Como Entero
	Definir alturaTotalVarones Como Entero
	Definir totalVarones Como Entero
	
	Repetir
		Escribir 'Ingrese la altura en centimetros'
		Leer altura
		si altura > 0 Entonces
			Escribir 'Ingrese la edad'
			Leer edad
			Escribir 'Ingrese el sexo'
			Escribir '1. Masculino'
			Escribir '2. Femenino'
			Leer sexo
			Si sexo = 1 Entonces
				alturaTotalVarones = alturaTotalVarones + altura
				totalVarones = totalVarones + 1
			SiNo
				alturaTotalMujeres = alturaTotalMujeres + altura
				totalMujeres = totalMujeres + 1
			Fin Si
			totalEdad = totalEdad + edad
		FinSi
	Hasta Que altura < 0
	promedioVarones = alturaTotalVarones / totalVarones
	promedioMujeres = alturaTotalMujeres / totalMujeres
	promedioEdad = totalEdad / (totalVarones + totalMujeres)
	Escribir 'El promedio de altura de las mujeres es ' promedioMujeres ' centimetros'
	Escribir 'El promedio de altura de los varones es ' promedioVarones ' centimetros'
	Escribir 'El promedio de edad de los participantes es ' promedioEdad ' anios'
FinAlgoritmo
