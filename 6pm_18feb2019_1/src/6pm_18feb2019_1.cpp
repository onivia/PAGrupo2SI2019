//============================================================================
// Name        : 6pm_18feb2019_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

struct Punto {
	int x; //4B
	int y; //4B
};

int main() {
	Punto *puntos = NULL;
	puntos = (Punto *) malloc(2*sizeof(Punto));

	puntos[0].x = 10;
	puntos[0].y = 20;

	puntos[1].x = 50;
	puntos[1].y = 60;

	for (int i = 0; i < 2; ++i) {
		cout<<puntos[i].x<<endl;
		cout<<puntos[i].y<<endl;
	}

	free(puntos);
	puntos=NULL;

	return 0;
}
