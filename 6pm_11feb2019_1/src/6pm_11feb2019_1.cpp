//============================================================================
// Name        : 6pm_11feb2019_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description :
/*
 * Actividad1-1 Ejericio (2):
 * 1. Capturar el numero (binario)
 * 2. Obtener la cantidad de cifras del numero binario
 * 3. En un ciclo, tantas cifras tenga el numero binario:
 * 		4. Obtengo una cifra (de derecha a izq)
 * 		5. Voy acumulando esto: cifra * (2^i) (donde i va de 0 hasta (cifra-1))
 * 	6. Muestro el resultado
 */
//============================================================================

#include <iostream>
#include <cmath>
using namespace std;

int obtenerCantidadCifras(int numero) {
	return (log10(numero) + 1);
}

int obtieneCifra(int numero, int cifra) {
	int extractor = pow(10,cifra);
	int separador = extractor / 10;
	int numerocifra= (numero % extractor) / separador;

	return numerocifra;
}

int main_2() {
	int numerobinario = 0;
	int cifras = 0;
	int cifra = 0;
	int numerodecimal = 0;

	//1.
	cout<<"Entre numero binario: ";
	cin>>numerobinario;

	//2.
	cifras = obtenerCantidadCifras(numerobinario);

	//3.
	for (int i = 0; i < cifras; ++i) {
		//4.
		cifra = obtieneCifra(numerobinario,i+1);
		//5.
		numerodecimal += cifra * pow(2,i);
	}

	//6.
	cout<<"El numero decimal es: "<<numerodecimal<<endl;

	return 0;
}
