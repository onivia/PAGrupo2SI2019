//============================================================================
// Name        : 6pm_15feb2019_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int a=10;
	int *p1=NULL;
	int **p2=NULL;
	int b=20;
	int *p3=NULL;
	int **p4=NULL;

	p1=&a;
	p2=&p1;
	//hagamos que p1 apunte a 'b' desde p4
	p4=&p1;
	*p4=&b;

	cout<<&a<<endl;

	return 0;
}
