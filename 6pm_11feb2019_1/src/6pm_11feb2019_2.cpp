#include <iostream>
using namespace std;

/*
 * Ejercicio (3)
 * 1. capturar numero
 * 2. En un ciclo, x10
 * 		3. muestro el producto de numero*i
 */

int main_3() {
	//1.
	int numero = 5;

	//2.
	for (int i = 1; i<=10;i++){
		//3.
		cout<<numero<<"X"<<i<<"="<<numero*i<<endl;
	}


	return 0;
}
