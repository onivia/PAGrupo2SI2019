//============================================================================
// Name        : 6pm_08feb2019_2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description :
	/*
	 * Resolver el ejercicio 1 de la actividad1-1
	 * 1. Capturar el numero como entero
	 * 2. obtener la unidad del numero, dividiendo entre 10 y tomando el residuo
	 * 3. Evaluo el residuo para saber si es: 1, 3, 5, 7 y 9, y hago la respectiva impresion.	 *
	 */
//============================================================================

#include <iostream>
using namespace std;

int main() {
	//1.
	int num = 0;
	cout<<"Entre numero: ";
	cin>>num;

	//2.
	int unidadnum = 0;
	unidadnum = num % 10;

	//3.
	switch(unidadnum) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			cout<<"El numero entrado fue: "<<num<<" y La unidad del numero es: "<<unidadnum<<endl;
			break;
		default:
			cout<<"NO es ningun caso!"<<endl;
			break;
	}
	return 0;
}
