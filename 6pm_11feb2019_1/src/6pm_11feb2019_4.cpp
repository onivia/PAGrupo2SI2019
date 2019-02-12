/*
 * 6pm_11feb2019_4.cpp
 *
 *  Created on: 11/02/2019
 *      Author: ONivia
 */

/*
 * Ejercicio (5)
 * 1. Obtener numero
 * 2. Obtener aleatorio >0 y <=numero
 */

#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int obtenerAleatorioRango(int desde, int hasta) {
	srand(time(NULL));
	int aleatorio = (rand() % hasta) + desde;

	return aleatorio;
}

int main() {
	//1.
	int numero = 2;

	//2.
	cout<<obtenerAleatorioRango(1,numero)<<endl;

	return 0;
}




