//============================================================================
// Name        : 6pm_18feb2019_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int *p = NULL;

	p = (int *) malloc(1*sizeof(int));
	*p = 30; //p[0]=30;
	p = (int *) realloc(p,2);
	*(p+1) = 50;  //p[1]=50;

	for (int i = 0; i < 2; ++i) {
		cout<<p[i]<<endl;
	}

	free(p);
	p = NULL;

	return 0;
}
