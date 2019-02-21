//============================================================================
// Name        : 6pm_20feb2019_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

struct Orden {
	int numero;
	char fecha[16];
};

struct Cliente {
	int nit;
	char nombre[32];
	int cantOrdenes;
	Orden *ordenes;
};

int main() {
	int cantClientes = 0, cantOrdenes = 0;
	Cliente *clientes = NULL;
	Orden *ordenes = NULL;

	cout<<"Entre cantidad de Clientes: "<<endl;
	cin>>cantClientes;

	//clientes = (Cliente *)malloc(cantClientes * sizeof(Cliente));
	clientes = new Cliente[cantClientes];

	for (int i = 0; i < cantClientes; ++i) {
		cout<<"Entre Nit: "<<endl;
		cin>>clientes[i].nit;
		cin.ignore();
		cout<<"Entre Nombre: "<<endl;
		cin.getline(clientes[i].nombre, 32);

		cout<<"Entre cantidad de Ordenes: "<<endl;
		cin>>cantOrdenes;

		ordenes = (Orden *)malloc(cantOrdenes * sizeof(Orden));
		clientes[i].cantOrdenes = cantOrdenes;
		for (int j = 0; j < cantOrdenes; ++j) {
			cout<<"Entre numero de la orden: "<<endl;
			cin>>ordenes[j].numero;
			cin.ignore();
			cout<<"Entre fecha de la orden: "<<endl;
			cin.getline(ordenes[j].fecha, 16);
		}
		clientes[i].ordenes = ordenes; //(clientes + i)->ordenes = ordenes;
	}

	for (int i = 0; i < cantClientes; ++i) {
		cout<<"\t\tNit del Cliente ("<<i+1<<"): "<<clientes[i].nit<<endl;
		cout<<"\t\tNombre del Cliente ("<<i+1<<"): "<<clientes[i].nombre<<endl;
		ordenes = clientes[i].ordenes;
		for (int j = 0; j < clientes[i].cantOrdenes; ++j) {
			cout<<"\t\t\tNumero de orden del cliente("<<j+1<<"): "<<ordenes[j].numero<<endl;
			cout<<"\t\t\tFecha de la orden del cliente("<<j+1<<"): "<<ordenes[j].fecha<<endl;
		}
		free(clientes[i].ordenes);
		clientes[i].ordenes = NULL;
		ordenes = NULL;
	}
	free(clientes);
	clientes = NULL;

	return 0;
}
